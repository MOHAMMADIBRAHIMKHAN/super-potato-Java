package DML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteCls {

public	void DeleteMethod() {
		try {
			//step:1 load the driver classs
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2: create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ibrahim_khan","khan007");
			// step 3 create the statement object
			Statement stmt=con.createStatement();
		    // step 4 execute querry 
			ResultSet rs = stmt.executeQuery("DELETE FROM product_details  \r\n"
					+ "WHERE pid = 'EE025'  \n ");
			System.out.println("Record deleted successfully");
			con.close();
		}

	catch(Exception e) {
		System.out.println("Error at Delete  class in DML package :"+e);
	}	
	
	}
}
