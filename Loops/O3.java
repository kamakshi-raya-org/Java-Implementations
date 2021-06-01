package lab3;
import java.util.Scanner;
public class O3 {

	public static void main(String[] args) {
		int n, f1 = 0, f2 = 0, f3 = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        System.out.println("Fibonacci Series:");
        int i=0;
        while(i<= n){
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
            System.out.println(f1);
            i++;
        }
	}
	}
