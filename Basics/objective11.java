package lab2;

import java.util.Scanner; 

public class objective11 {

	public static void main(String[] args) {
		String branch; 
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter your branch(CSE/ECE/ME)"); 
 		branch = sc.nextLine();
		int year;
		year=2;
			switch(branch) {
			case "CSE":
				System.out.println("elective courses: Machine Learning, Big Data");
				break;
			case "ECE":
				System.out.println("elective courses: Advanced math's, English");
				break;
			case "ME":
				System.out.println("elective courses: Physics, Chemistry");
				break;
			default:
				System.out.println("no such course exists");
				break;
		}
		
	}

	}
