package DDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TruncateCls {

public	void TruncateMethod() {
		try {
			//step:1 load the driver class
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//step2: create the connection object
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ibrahim_khan","khan007");
				// step 3 create the statement object
				Statement stmt=con.createStatement();
			    // step 4 execute querry 
				ResultSet rs = stmt.executeQuery("truncate table PRODUCT_DETAILS");
				System.out.println("Table Truncated  successfully ! ");
				con.close();
				
				
			}
			catch(Exception e) {
			System.out.println("Error at Truncate  class in DDL package :"+e);
			}
	}
}
