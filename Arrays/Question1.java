package labass11E;
import java.util.ArrayList;
import java.util.*;
public class Question1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of array ");
		int n=sc.nextInt();
		ArrayList arr=new ArrayList<Integer>();
		System.out.println("Enter all elements ");
		for(int i=0;i<n;i++)
		{
			char ch=sc.next().charAt(0);
			arr.add(ch);
		}
		boolean b=true;
		for(int i=0;i<n;i++)
		{
			if(arr.get(i)!=arr.get(n-1-i))
			{
				b=false;
			}
		}
		if(b) {
			System.out.println(arr);
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				arr.add(arr.get(n-1-i));
			}
			System.out.println(arr);
		}
		
	}
}

