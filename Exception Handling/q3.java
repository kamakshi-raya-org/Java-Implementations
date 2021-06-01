package lab18;
import java.util.Scanner;
public class q3 {

	void divide() throws ArithmeticException {
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 2 no.s = ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		throw new ArithmeticException();
		}
		catch ( ArithmeticException e)
		{
			System.out.println("exception is handled in q3 class !");
			throw e;
		}
	}
}
