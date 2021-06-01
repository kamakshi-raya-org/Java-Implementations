package lab8;
import java.util.Scanner;
public class o8 {
	public String reverse() {
		Scanner in = new Scanner(System.in);
	    System.out.println("Enput the String : ");
	    String s = in.nextLine();
	     String[] strarray = s.split(" "); 
	        StringBuilder sb = new StringBuilder();
	        for(String ss:strarray){
	            if(!s.equals("")){
	               StringBuilder sB = new StringBuilder(ss);
	               String rev = sB.reverse().toString();
	               sb.append(rev+" "); 
	            }    
	        }
	        return  sb.toString();
	        
	    }
	    
	

	
}
