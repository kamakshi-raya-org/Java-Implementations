package lab5;
import java.util.Scanner;
public class obj1 {
		private int number1; private int number2;
		public int getNumber1() { return number1;
		}
		public int getNumber2() {
			return number2;
		}
		public void setNumber1(int number1) {
			this.number1 = number1;}
		public void setNumber2(int number2) {
			this.number2 = number2;}
		public int addition(int num1, int num2) {
			return num1 + num2;}
		public int multiplication(int num1, int num2) {
			return num1 * num2;}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int userPreference;
			obj1 userInput = new obj1(); 
			System.out.println("Enter the first number");
			userInput.setNumber1(sc.nextInt()); 
			System.out.println("Enter the second number");
			userInput.setNumber2(sc.nextInt());
			System.out.println("Press 1 to display addition," + " 2 to display multiplication and " + "3 to display the numbers");
			userPreference = sc.nextInt(); 
			if (userPreference == 1) {
				int add;
				int num1,num2;
				num1 = userInput.getNumber1();
				num2 = userInput.getNumber2();
				add = userInput.addition(Math.abs(num1),Math.abs(num2) ); 
				System.out.println("Addition of 2 numbers is " + add);
			} else if (userPreference == 2) { 
				int multi;
				int num1,num2;
				num1 = userInput.getNumber1();
			    num2 = userInput.getNumber2();
			    multi = userInput.multiplication(Math.abs(num1),Math.abs(num2));
			    System.out.println("Multiplication of 2 numbers is " + multi); }
			else if (userPreference == 3) {
				System.out.println("Numer 1 is " +userInput.getNumber1());
				System.out.println("Numer 2 is " +userInput.getNumber2()); 
				System.out.println("Have a nice day.... Bye");
			}
			sc.close();
		}
}