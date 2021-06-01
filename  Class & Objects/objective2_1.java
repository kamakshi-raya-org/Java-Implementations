package lab5;
import java.util.Scanner;
import java.util.*;
public class objective2_1 {
		public int fib() {
			int t1=0,t2=1,t3=0;
			int return_var=0;
			for(int i=0;i<15;i++) {
				return_var=t1;
				t3=t1+t2;
				t1=t2;
				t2=t3;
			}
			return return_var;
		}
		public int prime(int begin, int end) {
			int count=0;
			boolean flag=true;
			for(int i=begin; i<=end;i++) {
				for(int j=2;j<i;j++) {
					flag=true;
					if(i%j==0) {
						flag=false;
						break;
					}
				}
				if(flag) {
					if(i==0) {
						continue;
					}
					else if(i==1) {
						continue;
					}
					count++;
				}
			}
			return count;
		}
		public void fact(int num) {
			int f=1;
			for(int i=1;i<=num;i++) {
				f=f*i;
			}
			System.out.println("The Factorial of the Number is: "+f);
		}
		public int arm() {
			int count=0;
			int i=1,n,l,sum=0,d;
			while(count<20) {
				n=i;
				l=(String.valueOf(i)).length();
				while(n>0) {
					d=n%10;
					sum+=Math.pow(d, l);
						n=n/10;
				}
				if(i==sum) {
					System.out.println(i);
					count++;
				}
				sum=0;
				i++;
			}
			return count;
		}
	}
