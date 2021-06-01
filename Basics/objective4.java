package lab2;

import java.util.Scanner;

public class objective4 {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		if(a<0) {
			System.out.println("a is negative");
		}
		else
			System.out.println("a is positive");

	}

}
