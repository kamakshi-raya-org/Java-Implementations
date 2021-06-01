package labass11E;

import java.util.ArrayList;
import java.util.Scanner;

public class Question8 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of array ");
	int n=sc.nextInt();
	int[] a= new int[n];
	System.out.println("Enter all the elements ");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter array of given sequence ");
	int[]b=new int[n];
	for(int i=0;i<n;i++)
	{
		b[i]=sc.nextInt();
	}
	for(int i=1;i<n;i++)
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
	for(int i=1;i<n;i++)
	{
		for(int j=0;j<i;j++)
		{
			if(b[j]>b[j+1])
			{
				int temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
			}
		}

	}
	boolean f=true;
	for(int i=0;i<n;i++)
	{
		if(a[i]!=b[i])
			f=false;
	}
	if(f)
	{
		System.out.println("Yes");
	}
}
}
