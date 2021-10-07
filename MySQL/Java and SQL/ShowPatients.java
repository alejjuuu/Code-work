import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;

public class ShowPatients {
	public static void main(String [] args) {
		System.out.println("Hello");
	 	Connection conn1 = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String url1 = "jdbc:mysql://localhost:3306/lvelasquezro";
            		String user = "velasquezro.luis";
            		String password = "ccm0902431";
            		conn1 = DriverManager.getConnection(url1, user, password);
            		if (conn1 != null) {
                		System.out.println("Connected to the database");
            		}
			stmt = conn1.createStatement();
			rs = stmt.executeQuery("select concat(firstname,' ', lastname), balance from Patient");
			System.out.println("Customer Name\tBalance");
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
	 	} catch (SQLException ex) {
            		System.out.println("An error occurred. Maybe user/password is invalid");
            		ex.printStackTrace();
        	}
	}
}