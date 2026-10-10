package om.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToWorkBench {
	public static void main(String... strings) throws ClassNotFoundException, SQLException {
	
	
	//Register the driver
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Establish a connection 
	Connection con = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/sqlconnect",
		    "root",
		    "Gopi@1234"
		);
	
	//create query
	String query = "insert into employee values (2, 'SriRam', 25000)";
	
	//executeQuery
	Statement stmt = con.createStatement();

	int rows = stmt.executeUpdate(query);
	System.out.println("query executed");
	
	//close connection
	con.close();

}
}
