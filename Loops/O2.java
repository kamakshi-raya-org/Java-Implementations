package lab3;
import java.util.Scanner;
public class O2 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i,j,s;
		j=n;
		s=0;
		while(j>0) {
			i=j%10;
			s+=Math.pow(i,3);
			j=j/10;	
		}
		if(s==n) {
			System.out.println(n+" is an Armstrong number");
		}
		else
			System.out.println(n+" is not an Armstrong number");
	}

}
