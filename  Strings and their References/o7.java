package lab8;
import java.util.Scanner;
public class o7 {
	public void chkpalindrome() {
		String s, rev = "";
	      Scanner in=new Scanner(System.in);
	      System.out.println("Enter a string:");
	      s=in.nextLine();
	      int length=s.length();
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + s.charAt(i);
	      if (s.equals(rev))
	         System.out.println(s+" is a palindrome");
	      else
	         System.out.println(s+" is not a palindrome");
	 
	}
}
