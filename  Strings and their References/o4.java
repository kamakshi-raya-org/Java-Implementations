package lab8;
import java.util.Scanner;
public class o4 {
	Scanner in=new Scanner(System.in);
	public void getindex() {
		System.out.println("Enter a string");
		String a =in.nextLine();
		System.out.println("Enter the character");
		String b=in.nextLine();
		int x=a.lastIndexOf(b);
		System.out.println("last index of "+b+" is : "+x);
	}
	
}
