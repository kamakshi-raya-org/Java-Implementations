package lab18;
import java.util.Scanner;
import java.util.Arrays;
public class q4 {
	public static void main(String[] args) {
		int[] a=new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the "+a.length+" elements");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		try { 
            System.out.println("inside main"); 
            throw new ArithmeticException(); 
        } 
        finally
        { 
            System.out.println("entered array is "+ Arrays.toString(a)); 
        } 
		
	}

}
