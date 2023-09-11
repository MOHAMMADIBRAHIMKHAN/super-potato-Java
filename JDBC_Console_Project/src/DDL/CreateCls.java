package DDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateCls {

public	void CreateMethod() {
try {
//step:1 load the driver class
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//step2: create the connection object
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ibrahim_khan","khan007");
	// step 3 create the statement object
	Statement stmt=con.createStatement();
    // step 4 execute querry 
	ResultSet rs = stmt.executeQuery("create table PRODUCT_DETAILS(Pid varchar2(5),Pname varchar2(15),Price number(5),Mfg_Date date,Exp_Date date,Remarks varchar2(20))");
	System.out.println("Table created successfully ! ");
	con.close();
	
	
}
catch(Exception e) {
	System.out.println("Error at create class in DDL package :"+e);
}
}
}