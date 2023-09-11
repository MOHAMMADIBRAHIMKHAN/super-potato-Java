import java.util.Scanner;

import java.util.Scanner.*;
import java.sql.*;
import DDL.*;
import DML.*;
import DQL.*;

public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		do {
		
		System.out.println("DataBase Crud Operations : \n");
		System.out.println("1.Create Rule \n"
				+"2.Alter Rule \n"
				+"3.Drop Rule \n"
				+"4.Truncate Rule \n"
				+"5.Insert Rule \n"
				+"6.Update Rule \n"
				+"7.Delete Rule \n"
				+"8.Select Rule \n");
		System.out.println(" Which rule you Wnna Apply  :.");
				Scanner s;
				s=new Scanner(System.in);
				ch  = s.nextInt();
				
				switch(ch) {
				
				case 1 : CreateCls c;
				c=new CreateCls();
				c.CreateMethod();
				break;
				
				case 2 : AlterCls  a;
				a= new AlterCls();
				a.AlterMethod();
				break;
				
				case 3 : DropCls d;
				d=new DropCls();
				d.DropMethod();
				break;
				
				case 4: TruncateCls t;
				t=new TruncateCls();
				t.TruncateMethod();
				break;
				
				case 5 : InsertCls i;
				i=new InsertCls();
				i.InsertMethod();
				break;
				
				case 6 : UpdateCls  u;
				u= new UpdateCls();
				u.UpdateMethod();
				break;
				
				case 7 : DeleteCls de;
				de=new DeleteCls();
				de.DeleteMethod();
				break;
				
				case 8: SelectCls s1;
				s1= new SelectCls();
				s1.SelectMethod();
				break;
				
				default:if (ch>0)
					System.out.println("Worng input ! select from 1-8 options \n");
				}	
				
				
				}while(ch!=0);
				System.out.println("Your process is terminated!");
				
	}

}
