package lab13;
import java.util.Scanner;
public class q3 {
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
		int max=arr[0],ind=0,temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				
		}
		int diff=arr[n-1]-arr[0];
		System.out.println("difference is "+diff);
	}

}
