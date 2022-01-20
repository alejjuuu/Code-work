//<html><head></head><body data-new-gr-c-s-loaded="9.22.0"><pre style="word-wrap: break-word; white-space: pre-wrap;">""

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;
import java.util.Scanner;

public class UpdatePatients {
	public static void main(String [] args) {
		System.out.println("Hello");
	 	Connection conn1 = null;
		Statement stmt = null;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the patient number: ");
		String patientnum = console.nextLine();
		System.out.print("Enter the new balance: ");
		double newBalance = console.nextDouble();
		try {
			String url1 = "jdbc:mysql://localhost:3306/databasename?serverTimezone=UTC";
            		String user = "username";
            		String password = "password";
            		conn1 = DriverManager.getConnection(url1, user, password);
            		if (conn1 != null) {
                		System.out.println("Connected to the database");
            		}
			stmt = conn1.createStatement();
			String sql = "Update Patient set balance = "+newBalance +
			" where patientnum = '" + patientnum +"';";

			int rows = stmt.executeUpdate(sql);	
			//executeUpdate -&gt;insert, update, delete
			if (rows != 1)
				System.out.println("Update was not successful");
			else
				System.out.println(rows + " rows updated");
	 	} catch (SQLException ex) {
            		System.out.println("An error occurred. Maybe user/password is invalid");
            		ex.printStackTrace();
        	}
	}
// }</pre></body></html>
