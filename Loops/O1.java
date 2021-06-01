package lab3;

import java.util.Scanner;

public class O1 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		int s,t,u;
		u=n;
		s=0;
		while(u>0) {
			
			t=u%10;
			u=u/10;
			s+=1;
			
		}
		System.out.println(s);
	}

}
