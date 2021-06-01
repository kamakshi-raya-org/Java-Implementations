package labass11E;

import java.util.ArrayList;
import java.util.Scanner;

public class Question11 {
public static void main(String[] args) {
		
		ArrayList a= new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 15 numbers");
		for(int i=0;i<15;i++)
		{
			int x=sc.nextInt();
			a.add(x);
		}
		ArrayList arr=new ArrayList<Integer>();
		int c=0;
		for(int i=0;i<15;i++)
		{
			boolean b=true;
			for(int j=0;j<c;j++)
			{
				if(a.get(i)==arr.get(j))
				{
					b=false;
				}
			}
			if(b)
			{
				arr.add(a.get(i));
				c++;
			}
		}
		System.out.println(arr);
}
}
