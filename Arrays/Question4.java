package labass11E;
import java.util.*;
public class Question4 {
	public static void main(String[] args) {
	
		String[] a= new String[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 20 binary numbers");
		for(int i=0;i<20;i++)
		{
			a[i]=sc.nextLine();
		}
		for(int i=1;i<=19;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(Integer.parseInt(a[j],2)>Integer.parseInt(a[j+1],2))
				{
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<20;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
	
}
