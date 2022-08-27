package SQL_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Basic {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// connect with oracle database
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// create the database connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe");
		// write the query
		String s = "Select * from Employees";
		// Statement oracle
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		// Execute the Query
		ResultSet executeQuery = prepareStatement.executeQuery();
		// iterate the table row by row
		while (executeQuery.next()) {
			String string = executeQuery.getString("first_name");
			System.out.println(string);
		}
		// connection.close();
	}

}
