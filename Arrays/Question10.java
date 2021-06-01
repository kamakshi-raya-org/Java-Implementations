package labass11E;

import java.util.Scanner;

public class Question10 {
public static void main(String[] args) {
		
		int[] a= new int[10];
		

		int[] b= new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[20];
		for(int i=0;i<10;i++)
		{
			c[i]=a[i];
			c[i+10]=b[i];
		}
		for(int i=0;i<20;i++)
		{
			System.out.print(" "+c[i]);
		}
}
}
