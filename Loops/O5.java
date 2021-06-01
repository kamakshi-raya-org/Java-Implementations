package lab3;

public class O5 {

	public static void main(String[] args) {
		int n=145,n1=n;
		int s=0;
		do {
			int d;
			
			int i=1,f=1;
			d=n1%10;
			while(i<=d) {
				f*=i;
				i++;
				}
			s+=f;
			n1/=10;	
			}while(n1>0);
		if(s==n) {
			System.out.println(n+" is a Strong number");
			}
		else
			System.out.println(n+" is not a Strong number");
	}
}
