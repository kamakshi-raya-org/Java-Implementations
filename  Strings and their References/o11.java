package lab8;
import java.util.*;
public class o11 {
	public void replace() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=in.nextLine();
		System.out.println("Enter second string");
		String s2=in.nextLine();
		System.out.println("Strings before replacing:");
		System.out.println("str1: "+s1);
		System.out.println("str2: "+s2);
		System.out.println("Strings after replacing:");
		System.out.println("str1: "+s1.replace(s1,s2));
		System.out.println("str2: "+s2);
	}

}
