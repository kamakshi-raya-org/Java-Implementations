package lab11;
import java.util.Scanner;
public class obj4 {
	Scanner in=new Scanner(System.in);
	public void newarray(int arr[]) {
		System.out.println("At which position do you want to insert the element?");
		int p=in.nextInt();
		System.out.println("Enter the element that you want to insert : ");
		int e=in.nextInt();
		for(int i=arr.length-1;i>p-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[p-1]=e;
		System.out.println("New array after inserting the element "+e+" at "+p+"th position:");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
	}
}
