package DAO;

import java.sql.*;

public class loginDAO {

	public static boolean login(String usuario, String contrasenia) {

		// Create a variable for the connection string.
		String connectionUrl = "jdbc:sqlserver://AULA523\\BVRGUILLX:1433;"
				+ "databaseName=Taller;user=java ;password=java1";

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Establish the connection.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl);

			// Create and execute an SQL statement that returns some data.
			// String SQL = "SELECT TOP 10 * FROM Empleados";
			stmt = con.createStatement(); 
			rs = stmt.executeQuery("SELECT * FROM login WHERE Usuario='"+usuario+"' AND Contrasenia='"+contrasenia+"'");

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				return true;
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
		}
		return false;
	}
}