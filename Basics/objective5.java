package lab2;

public class objective5 {

	public static void main(String[] args) {
		float n=(float)0.86;
		if(n>0) {
			if(-1<n && 1>n) {
				System.out.println("n is positive and small");
			}
			else if(-100000<n && n>100000) {
				System.out.println("n is positive and large");
			}
			else
				System.out.println("n is positive");
		}
		if(n<0) {
			if(-1<n && 1<n) {
				System.out.println("n is negative and small");
			}
			else if(-100000<n && n>100000) {
				System.out.println("n is negative and large");
			}
			else
				System.out.println("n is negative");
		}
	}
}

