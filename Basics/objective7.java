package lab2;

import java.util.Scanner;

public class objective7 {

	public static void main(String[] args) {
		int qs, ms, fs;
		System.out.println("Enter the quiz score");
		System.out.println("Enter the mid-term score");
		System.out.println("Enter the final score");
		Scanner in = new Scanner(System.in);
		qs=in.nextInt();
		ms=in.nextInt();
		fs=in.nextInt();
		float y;
		y=(float) ((qs+ms+fs)/3)*100;
		if(y>=90) {
			System.out.println("Grade A;");
		}
		else if(y>=70 && y<90) {
			System.out.println("Grade B");
		}
		else if(y>=50 && y<70) {
			System.out.println("Grade C");
		}
		else
			System.out.println("Grade F");
	}

}
