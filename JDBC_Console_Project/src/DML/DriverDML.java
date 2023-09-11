package DML;

import java.util.Scanner;

import DDL.AlterCls;
import DDL.CreateCls;
import DDL.DropCls;
import DDL.TruncateCls;

public class DriverDML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		System.out.println("DataBase DML Operations : ");
		System.out.println("1.Insert  Rule \n"
				+"2.Update Rule \n"
				+"3.Delete Rule \n");
		System.out.println(" Which rule you Wnna Apply  :->");
				Scanner s;
				s=new Scanner(System.in);
				ch  = s.nextInt();
				
				switch(ch) {
				
				case 1 : InsertCls i;
				i=new InsertCls();
				i.InsertMethod();
				break;
				
				case 2 : UpdateCls  u;
				u= new UpdateCls();
				u.UpdateMethod();
				break;
				
				case 3 : DeleteCls d;
				d=new DeleteCls();
				d.DeleteMethod();
				break;
				
		
				
				default :
					System.out.println("Wrong Method Selected !!");
				}
		
	}

}
