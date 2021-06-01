package lab5;
import java.util.Scanner;
public class Objective1 {
	private int num1 = 5; private int num2 = 10;
	public int addition() { return num1 + num2;
	}
	public int multiplication() { return num1 * num2;
	}
	public int division() { return num1 / num2;
	}
	public int subtraction() { return num1 - num2;
	}
	public static void main(String[] args) {
		int choice;
	do {
	System.out.println("Help on:"); 
	System.out.println(" 1. addition"); 
	System.out.println(" 2. multiplication");
	System.out.println(" 3. Subtraction");
	System.out.println(" 4. division");
	System.out.println("Choose one:"); 
	Scanner sc = new Scanner(System.in); 
	choice = sc.nextInt();
	} while (choice < 1 || choice > 4);
	Objective1 operation = new Objective1();
	int value;
	switch (choice) { case 1:
	value = operation.addition(); System.out.println("Addition of two numbers is " + value); break;
	case 2:
	              value = operation.multiplication();
	System.out.println("multiplication of two numbers is " + value);
	break; case 3:
	               value = operation.subtraction();
	System.out.println("subtraction of two numbers is " + value);
	break; case 4:
	value = operation.division(); System.out.println("division of two numbers is " + value); break;
	}

	
	}

}
