package DQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectCls {
public void SelectMethod() {
	 try {
			//step:1 load the driver classs
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2: create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ibrahim_khan","khan007");
			// step 3 create the statement object
			Statement stmt=con.createStatement();
		    // step 4 execute querry 
			ResultSet rs = stmt.executeQuery("select * from product_details");
			System.out.println("Table Records from Product_details : ");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getDate(4)+" "+rs.getDate(5)+" "+rs.getString(6));
			}
			con.close();
		}
	catch(Exception e) {
		System.out.println("Error at Select class in DQL package:"+e);
	}
 }
}
