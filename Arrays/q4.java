package lab13;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=in.nextInt();
		int []arr=new int[n];
		int even=0,odd=0;
		System.out.println("Enter the array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the integer "+(i+1)+" :");
			arr[i]=in.nextInt();
			}
		System.out.println("The entered array:");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
		System.out.println("");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("No. of even integers: "+even);
		System.out.println("No. of odd integers: "+odd);
	}

}
