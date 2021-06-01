package lab9;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Grade:");
		String grade=in.nextLine();
		switch(grade) {
		case "A":
			System.out.println("80-100 marks");
			break;		
		case "C":
			System.out.println("65-72 marks");
			break;
		case "D":
			System.out.println("55-164 marks");
			break;
		case "E":
			System.out.println("80-100 marks");
			break;
		case "B":
			System.out.println("73-79 marks");
			break;
		default:
			System.out.println("Grade does not exist");
			break;
		}
		

	}

}
