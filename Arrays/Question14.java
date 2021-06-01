package labass11E;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= new int[10];
		System.out.println("Enter all the elements of array");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			if(a[i]<=0)
			{
				a[i]=0;
			}
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(" "+a[i]);
		}
}
}
