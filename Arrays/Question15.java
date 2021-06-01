package labass11E;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a= new int[10];
		System.out.println("Enter all the elements of array");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=7;i++)
		{
			int sum=a[i];
			for(int j=i+1;j<=8;j++)
			{
				sum=a[i]+a[j];
				for(int k=j+1;k<=9;k++)
				{
					sum=a[i]+a[j]+a[k];
					if(sum==0)
						System.out.println("Triplet : "+a[i]+" "+a[j]+" "+a[k]);
				}
			}
		}
	}

}
