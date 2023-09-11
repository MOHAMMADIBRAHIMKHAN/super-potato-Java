package DML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertCls {

public	void InsertMethod() {
		try {
			//step:1 load the driver classs
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2: create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ibrahim_khan","khan007");
			// step 3 create the statement object
			Statement stmt=con.createStatement();
		    // step 4 execute querry 
			ResultSet rs = stmt.executeQuery("insert into product_details values('EE025','Calpa-x112',6000,TO_DATE( '01 Jan 2023', 'DD MON YYYY' ),TO_DATE( '11 March 2024', 'DD MON YYYY'),'keep in cool place')");
			System.out.println("Record inserted successfully");
			con.close();
		}

	catch(Exception e) {
		System.out.println("Error at insert class in DML package :"+e);
	}	
	}
}
