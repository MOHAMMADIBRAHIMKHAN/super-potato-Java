package DDL;

import java.util.Scanner;

import DML.InsertCls;
import DML.UpdateCls;
import DQL.SelectCls;

public class DriverDDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ch;
		System.out.println("DataBase DDL Operations : ");
		System.out.println("1.Create Rule \n"
				+"2.Alter Rule \n"
				+"3.Drop Rule \n"
				+"4.Truncate Rule \n");
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
				
				default :
					System.out.println("Wrong Method Selected !!");
				}
	}

}
