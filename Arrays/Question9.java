package labass11E;

import java.util.Scanner;

public class Question9 {
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
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n-i-1;j++)
				{
				if(a[j]==a[j+1]-1)
				{
					c[i]++;
				}
				}
		}
				
		int max=c[0];
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(c[i]>max)
			{
				max=c[i];
				index=i;
			}
		}
		for(int i=index;i<index+c[index];i++)
		{
			System.out.print(" "+a[i]);
		}
		
				
			
		}
	}

