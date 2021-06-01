package labass11E;
import java.util.*;
public class Question12 {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows/columns :");
	int n=sc.nextInt();
	int[][] a=new int[n][n];
	System.out.println("Enter all the elements ");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("Diagonal elements ");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j)
			{
				System.out.print(" "+a[i][j]);
			}
			
		}
	}
	
}
}
