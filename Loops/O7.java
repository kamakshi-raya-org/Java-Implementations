package lab3;
import java.util.Scanner;
public class O7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a natural number :");
		int n=in.nextInt();
		int s=0;
		System.out.println("The first "+n+" natural numbers are :");
		for(int i=1;i<=n;i++) {
			System.out.println(i);
			s+=i;
		}
		System.out.println("The sum of natural numbers upto "+n+" terms is "+s);
	}

}
