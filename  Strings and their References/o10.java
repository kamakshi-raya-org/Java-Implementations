package lab8;
import java.util.*;
public class o10 {
	public void getsubstring() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s=in.nextLine();
		System.out.println("Enter start index :");
		int i1=in.nextInt();
		System.out.println("Enter end index :");
		int i2=in.nextInt();
		System.out.println(s.substring(i1,i2));
	}
}
