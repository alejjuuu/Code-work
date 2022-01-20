import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;

public class TestConnection {
	public static void main(String [] args) {
		System.out.println("Hello");
	 	Connection conn1 = null;
		try {
			String url1 = "jdbc:mysql://localhost:3306/username?serverTimezone=UTC";
            		String user = "username";
            		String password = "password";
            		conn1 = DriverManager.getConnection(url1, user, password);
            		if (conn1 != null) {
                		System.out.println("Connected to the database");
            		}
	 	} catch (SQLException ex) {
            		System.out.println("An error occurred. Maybe user/password is invalid");
            		ex.printStackTrace();
        	}
	}
}
