package lab3;

public class O4 {

	public static void main(String[] args) {
		int n=10;
		do {
			int i=1,f=1;
			while(i<=n) {
				f*=i;
				i++;
				}
			System.out.println(n+" factorial = "+f);
			n+=1;
		}while(n<=15);
	
	}

}
