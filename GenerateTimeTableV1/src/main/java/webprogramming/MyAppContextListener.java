package webprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyAppContextListener implements ServletContextListener  {
	@Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        Statement stmt = null;
        Connection conn = null;
        try{
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
            String sql = "CREATE TABLE IF NOT EXISTS Students (" +
                         "id VARCHAR(100) PRIMARY KEY," +
                         "name VARCHAR(100) NOT NULL," +
                         "password VARCHAR(100) NOT NULL)";
            stmt.executeUpdate(sql);
            sql = "DROP TABLE Store";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE IF NOT EXISTS Store (" +
                    "id int AUTO_INCREMENT PRIMARY KEY," +
                    "studentID VARCHAR(100) NOT NULL," +
                    "course VARCHAR(100) NOT NULL," +
                    "professor VARCHAR(100) NOT NULL," +
                    "grade int NOT NULL," +
                    "day int NOT NULL," +
                    "start int NOT NULL," +
                    "end int NOT NULL," +
                    "location VARCHAR(100) NOT NULL)";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 리소스 해제
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}
}
