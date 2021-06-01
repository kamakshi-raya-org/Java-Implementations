package labass11E;
import java.util.*;
public class Question13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int[] a= new int[10];
	System.out.println("Enter all the elements of first array");
	for(int i=0;i<10;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter all the elements of second array ");
	int[]b=new int[10];
	for(int i=0;i<10;i++)
	{
		b[i]=sc.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println("Common element : "+a[i]);
			}
		}
	}
	
}
}