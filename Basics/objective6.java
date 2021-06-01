package lab2;

import java.util.Scanner;

public class objective6 {

	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Enter the coefficients");
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		float y=(b*b)-(4*a*c);
		float x1;
		float x2;
		if((b*b)-(4*a*c)>=0) {
			x1= (float) (-b+Math.sqrt(y))/2*a;
			x2= (float) (-b-Math.sqrt(y))/2*a;
			System.out.println(x1+" and "+x2+" are the solutions of the given equation");
		}
		else if((b*b)-(4*a*c)<0) {
			System.out.println("the equation has no solution");
			
			
			
			
		}

	}

}
