package labass11E;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of triangle ");
		int n=sc.nextInt();
		char a[][]=new char[n][];
		for(int i=0;i<n;i++)
		{
			a[i]=new char[n-i];
			for(int j=0;j<n-i;j++)
			{
				a[i][j]='*';
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
