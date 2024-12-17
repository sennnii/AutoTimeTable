package webprogramming;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import webprogramming.Infromation.Session;
import webprogramming.Infromation.TNL;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.DayOfWeek;
import java.util.ArrayList;

/**
 * Servlet implementation class Mypage
 */
@WebServlet("/Mypage")
public class Mypage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mypage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		String sql;
		HttpSession session1 = request.getSession();
		String id =  (String) session1.getAttribute("userID");
		ArrayList<Session> sessions = new ArrayList<Session>();
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
		    stmt = conn.createStatement();
		    sql = "select * from Store WHERE studentID = '" + id + "'";
		    rs = stmt.executeQuery(sql);
		} catch (Exception e) {
		    PrintWriter out = response.getWriter();
		    out.println("DB 연동 오류입니다.: " + e.getMessage());
		}
			try {
				while (rs.next()) {
					String course = rs.getString("course");        
				    String professor = rs.getString("professor");  
				    int day = rs.getInt("day");                    
				    int start = rs.getInt("start");                
				    int end = rs.getInt("end");
				    int grade = rs.getInt("grade");
				    String location = rs.getString("location");
				    DayOfWeek dayOfWeek = DayOfWeek.of(day);
				    TNL time = new TNL(dayOfWeek, start, end, location);
			        boolean sessionFound = false;
			        for (Session session : sessions) {
			            if (session.getClassName().equals(course)) { // course 이름 비교
			                session.addTime(time); // time 추가
			                sessionFound = true;
			                break;
			            }
			        }
			        if (!sessionFound) {
			            Session newSession = new Session(course, professor, grade);
			            newSession.addTime(time);
			            sessions.add(newSession);
			        }
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
		        if (rs != null) rs.close();
		        if (stmt != null) stmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
			request.setAttribute("sessions", sessions);
			RequestDispatcher view = request.getRequestDispatcher("myPage.jsp");
			view.forward(request, response);
	}

}
