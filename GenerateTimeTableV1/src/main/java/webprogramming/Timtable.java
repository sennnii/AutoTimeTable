package webprogramming;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import webprogramming.Calculate.DecodeCondition;
import webprogramming.Calculate.TimeCalculator;
import webprogramming.Infromation.Session;
import webprogramming.Infromation.TNL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.util.*;

import com.google.gson.Gson;

/**
 * Servlet implementation class Timtable
 */
@WebServlet("/Timtable")
public class Timtable extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final DecodeCondition decode = new DecodeCondition();
	private final TimeCalculator caculator = new TimeCalculator();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Timtable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] set = request.getParameterValues("cse");
		HttpSession session = request.getSession();
		ArrayList<ArrayList<Session>> timeTable = new ArrayList<ArrayList<Session>>();
		if(session.getAttribute("timetable") != null)
		{
			System.out.println("작동됨");
			timeTable = (ArrayList<ArrayList<Session>>) session.getAttribute("timetable");
			request.setAttribute("timeTable", timeTable);
			RequestDispatcher view = request.getRequestDispatcher("Timetable.jsp");
			view.forward(request, response);
		}
		else if(set==null)
		{
			request.setAttribute("timeTable", timeTable);
			RequestDispatcher view = request.getRequestDispatcher("Timetable.jsp");
			view.forward(request, response);
		}
		else
		{
			timeTable = caculator.calculateTime(request.getParameterValues("cse"), decode.getCondition());
			session.setAttribute("timetable", timeTable);
			request.setAttribute("timeTable", timeTable);
			RequestDispatcher view = request.getRequestDispatcher("Timetable.jsp");
			view.forward(request, response);
		}

	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

	        // JSON 문자열을 Java 2차원 배열로 변환
		StringBuilder jsonBuffer = new StringBuilder();
        BufferedReader reader = request.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonBuffer.append(line);
        }
        String jsonData = jsonBuffer.toString();
        // JSON 문자열을 Java 2차원 배열로 변환
        if (jsonData.startsWith("[[")) {
            Gson gson = new Gson();
            int[][] conditionArray = gson.fromJson(jsonData, int[][].class);
            decode.decode(conditionArray);
        }
        else
        {
        	PreparedStatement  pstmt = null;
    		Connection conn = null;
    		ResultSet rs = null;
    		String sql;
    		try {
    		    // 데이터베이스 연결 및 비밀번호 조회
    			String hostname = System.getProperty("RDS_HOSTNAME");
    			String port = System.getProperty("RDS_PORT");
    			String dbName = System.getProperty("RDS_DB_NAME");
    			String username = System.getProperty("RDS_USERNAME");
    			String password = System.getProperty("RDS_PASSWORD");
    			String url = String.format("jdbc:mysql://%s:%s/%s?serverTimezone=UTC", hostname, port, dbName);
    		    conn = DriverManager.getConnection(url, username, password);
            	//String url = "jdbc:mysql://localhost:3306/wptest?serverTimezone=UTC";
            	//conn = DriverManager.getConnection(url, "root", "0000");
                sql = "DELETE FROM Store WHERE studentID = ?";
                pstmt = conn.prepareStatement(sql);

                HttpSession session1 = request.getSession();
                String targetStudentID = (String) session1.getAttribute("userID");
                pstmt.setString(1, targetStudentID);

                // SQL 실행
                pstmt.executeUpdate();
	           	int singleNumber = Integer.parseInt(jsonData);
	           	ArrayList<ArrayList<Session>> timeTable = (ArrayList<ArrayList<Session>>) session1.getAttribute("timetable");
	           	ArrayList<Session> sessions = timeTable.get(singleNumber-1);
	           	 for(Session session:sessions)
	           	 {
	           		 String course = session.getClassName();
	           		 String professor = session.getProfessor();
	           		 int grade = session.getGrade();
	           		 ArrayList<TNL> times = session.getTime();
	           		 for(TNL time : times)
	           		 {
	           			int day = time.getDay().getValue();
	           			int start = time.getStart();
	           			int end = time.getEnd();
	           			String location = time.getLocation();
	           		    sql = "INSERT INTO Store (studentID, course, professor, grade, day, start, end, location) " +
	                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	           		    pstmt = conn.prepareStatement(sql);
			            pstmt.setString(1, targetStudentID); // studentID
			            pstmt.setString(2, course); // course
			            pstmt.setString(3, professor); // professor
			            pstmt.setInt(4, grade);
			            pstmt.setInt(5, day); // day (1: 월요일, 2: 화요일 ...)
			            pstmt.setInt(6, start); // start (시간, 예: 0900)
			            pstmt.setInt(7, end); // end (시간, 예: 1100)
			            pstmt.setString(8, location); // location
	                    // 쿼리 실행 (삽입 수행)
	                    int rowsAffected = pstmt.executeUpdate();
	                    if (rowsAffected > 0) {
	                        System.out.println("학생 정보가 성공적으로 삽입되었습니다.");
	                    } else {
	                        System.out.println("학생 정보 삽입에 실패했습니다.");
	                    }
	           		 }
	           	 }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (pstmt != null) pstmt.close();
                    if (conn != null) conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
	}

}
