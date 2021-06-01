package lab_7;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		calculator.a=in.nextInt();
		calculator.b=in.nextInt();
		calculator.addition();
		System.out.println(calculator.subtraction());
		calculator.multiplication(calculator.a,calculator.b);
		System.out.println(calculator.division(calculator.a,calculator.b));

	}
}
