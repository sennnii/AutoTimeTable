package webprogramming;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.*;
/**
 * Servlet implementation class SelectCondition
 */
@WebServlet("/SelectCondition")
public class SelectCondition extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectCondition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("ConditionSelect.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		String sql;
		String id = request.getParameter("studentnumber");
		String passworrd = request.getParameter("password");
		String answerID="123";
		String answerPassword="";
		try {
		    // 데이터베이스 연결 및 비밀번호 조회
			String hostname = System.getProperty("RDS_HOSTNAME");
			String port = System.getProperty("RDS_PORT");
			String dbName = System.getProperty("RDS_DB_NAME");
			String username = System.getProperty("RDS_USERNAME");
			String password1 = System.getProperty("RDS_PASSWORD");
			String url = String.format("jdbc:mysql://%s:%s/%s?serverTimezone=UTC", hostname, port, dbName);
		    conn = DriverManager.getConnection(url, username, password1);
        	//String url = "jdbc:mysql://localhost:3306/wptest?serverTimezone=UTC";
        	//conn = DriverManager.getConnection(url, "root", "0000");
		    stmt = conn.createStatement();
		    sql = "select * from Students WHERE id = '" + id + "'";
		    rs = stmt.executeQuery(sql);
		} catch (Exception e) {
		    PrintWriter out = response.getWriter();
		    out.println("DB 연동 오류입니다.: " + e.getMessage());
		}
			try {
				while (rs.next()) {
					answerID = rs.getString("id");
                    answerPassword = rs.getString("password");
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
			if(id.equals(answerID) && answerPassword.equals(passworrd))
			{
				HttpSession session = request.getSession();
			    
			    session.setAttribute("userID", id);
				doGet(request, response);
			}
			else {
				String errorMessage = "일치하지 않습니다.";
				String encodedMessage = URLEncoder.encode(errorMessage, StandardCharsets.UTF_8.toString());

				response.sendRedirect("Login.jsp?error=" + encodedMessage);		
			}
	}

}
