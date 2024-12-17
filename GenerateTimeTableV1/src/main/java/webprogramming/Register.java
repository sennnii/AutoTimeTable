package webprogramming;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PreparedStatement  pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		String sql;
		String id = request.getParameter("studentnumber");
		String password = request.getParameter("password");
		String name = request.getParameter("studentname");
		System.out.println(id);
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
        	sql = "INSERT INTO Students (id, name, password) VALUES (?, ?, ?)";

            // PreparedStatement 사용하여 매개변수 바인딩
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);       // 첫 번째 ?에 id를 바인딩
            pstmt.setString(2, name);     // 두 번째 ?에 name을 바인딩
            pstmt.setString(3, password); // 세 번째 ?에 password를 바인딩

            // 쿼리 실행 (삽입 수행)
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("학생 정보가 성공적으로 삽입되었습니다.");
            } else {
                System.out.println("학생 정보 삽입에 실패했습니다.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 리소스 해제
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
		response.sendRedirect("Login.jsp");	
	}
}

