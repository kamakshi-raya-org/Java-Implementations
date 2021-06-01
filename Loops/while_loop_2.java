package lab4;

public class while_loop_2 {

	public static void main(String[] args) {
		int n=5;
		int l=n;
		int k=1;
		while(l>0) {
			int i=1;
			while(i<=l) {
				System.out.print("*");
				i++;
			}
			System.out.println("");
			l--;	
		}
		while(k<=n) {
			int j=1;
			while(j<=k) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			k++;
		}
	}

}
