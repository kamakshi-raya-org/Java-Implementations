package lab3;

public class O6 {
	public static void main(String[] args) {
		int n=45;
		System.out.print("The prime factors of "+n+" are : ");
		int i=1;
		do {
			if(n%i==0) {
				int count=0;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						count++;
						break;
					}	
				}
				if(count==0) {
					System.out.print(i+" ");
				}
			}
			i++;	
		}while(i<n);
 }
}