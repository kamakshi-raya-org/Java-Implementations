package lab9;
import java.util.Scanner;
/**
 * To use Java Doc to seek help on existing class
 * To maintain a documentation for the methods
 * @author kamakshi
 *
 */
public class a13 {
	String Username;
	/**
	 * Takes Username as input
	 */
	a13(){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Usename : ");
	Username=in.nextLine();
	}
	/**
	 * Displays length of the string
	 * @return the length
	 */
	public int getLength() {
		return Username.length();
	}
	/**
	 * Greets the User
	 * @return Hi User
	 */
		public String getGreeting() {
			return "Hi "+Username;
		}
	/**
	 * Converts Username to lower case
	 * @return username
	 */ 
		public String convertLower() {
			return Username.toLowerCase();
		}
	/**
	 * Converts Username to upper case
	 * @return USERNAME
	 */
		public String convertUpper() {
			return Username.toUpperCase();
		}
	/**
	 *  Checks whether the name is starting with ‘a’
	 */
		public void Check() {
			if(Username.substring(0,1)=="a"||Username.substring(0,1)=="A") {
				System.out.println("The Username starts with 'a'");
			}
			else {
				System.out.println("The Username doesn't start with 'a'");
			}
		}
	
	
public static void main(String[]args) {
	a13 user=new a13();
}

}