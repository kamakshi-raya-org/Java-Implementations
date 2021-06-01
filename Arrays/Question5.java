package labass11E;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		
		int[] a= new int[15];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 15 numbers");
		for(int i=0;i<15;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<=14;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}

		}
		System.out.println("Third largest number  = "+a[12]);
}
}
