package labass11E;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
	int[] a= new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 10 numbers");
	for(int i=0;i<10;i++)
	{
		a[i]=sc.nextInt();
	}
	boolean b=true;
	if(a[0]>=0)
	{
		for(int i=2;i<10;i++)
		{
			if(a[i]<0)
			{
				b=false;
			}
		}
		for(int i=1;i<10;i++)
		{
			if(a[i]>=0)
				b=false;
		}
	}
	else {
		for(int i=2;i<10;i++)
		{
			if(a[i]>=0)
			{
				b=false;
			}
		}
		for(int i=1;i<10;i++)
		{
			if(a[i]<0)
				b=false;
		}
	}
	if(b)
	{
		System.out.println("They exist in sequence ");
	}
}
}
