package DQL;
import java.util.Scanner;
import java.util.Scanner.*;
public class DriverDQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ch;
		System.out.println("DataBase DQL Operations");
		System.out.println("1.Select Rule \n");
		System.out.println("Enter 1 to use select rule");
		Scanner s;
s = new Scanner(System.in);
ch =  s.nextInt();

switch(ch) {
case 1: SelectCls s1;
s1= new SelectCls();
s1.SelectMethod();
break;

default :
	System.out.println("Wrong number is pressed ! select 1");
}
	}

}
