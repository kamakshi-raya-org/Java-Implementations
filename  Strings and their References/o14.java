package lab8;
import java.util.*;
public class o14 {
	public void firstRepeatedchar() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string:");
		String s=in.nextLine();
		char [] words = s.toCharArray();
	    boolean repeatCharFound = false;
	    for (int i = 0; i < words.length; i++) {
	        if(!repeatCharFound){
	            char charPos = words[i];
	            for (int j = i+1; j < words.length; j++) {
	                if(charPos == words[j]){
	                    System.out.println("First Repeating Char is "+words[j]);
	                    repeatCharFound = true;
	                    break;
	                }
	            }
	        }
	    }
	    if(!repeatCharFound){
	        System.out.println("No repeating charector found");
	    }
	}
}
