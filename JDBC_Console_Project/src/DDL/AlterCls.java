package DDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AlterCls {
public	void AlterMethod() {
	try {
		//step:1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2: create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ibrahim_khan","khan007");
			// step 3 create the statement object
			Statement stmt=con.createStatement();
		    // step 4 execute querry 
			ResultSet rs = stmt.executeQuery("alter table PRODUCT_DETAILS modify Remarks varchar(20)");
			System.out.println("Table Altered  successfully ! ");
			con.close();
			
			
		}
		catch(Exception e) {
			System.out.println("Error at Alter  class in DDL package :"+e);
		}
}
}