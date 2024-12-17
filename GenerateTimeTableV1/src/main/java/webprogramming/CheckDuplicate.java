package webprogramming;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class CheckDuplicate
 */
@WebServlet("/CheckDuplicate")
public class CheckDuplicate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckDuplicate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder jsonBuffer = new StringBuilder();
        BufferedReader reader = request.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonBuffer.append(line);
        }
        String jsonData = jsonBuffer.toString();
        System.out.println(jsonData);
        Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		String sql;
		String id = jsonData;
		String answerID="";
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
		    sql = "select * from Students WHERE id = '" + id + "'";
		    rs = stmt.executeQuery(sql);
		} catch (Exception e) {
		    PrintWriter out = response.getWriter();
		    out.println("DB 연동 오류입니다.: " + e.getMessage());
		}
			try {
				while (rs.next()) {
					answerID = rs.getString("id");
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
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			if (id.equals(answerID)) {
			    out.print("{\"redirect\":\"CreateAccount.jsp?duplicate=true\"}");
			} else {
			    out.print("{\"redirect\":\"CreateAccount.jsp\"}");
			}
			out.flush();
	}

}
