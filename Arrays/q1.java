package lab13;

public class q1 {
	public void antidiagonal(int [][]arr) {
		int n=arr.length,m=0,l;
		System.out.println("The matrix:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("The anti-diagonals:");
		for(int i=0;i<n;i++) {
			l=0;
			int a=l;
			int b=m;
			System.out.print("[");
			for(int j=0;j<i+1;j++) {
				System.out.print(arr[a][b]+" ");
				a+=1;
				b-=1;
			}
			System.out.print("]");
			System.out.println("");
			m+=1;
		}
		int x=0;
		int k=1;
		for(int i=1;i<arr.length;i++) {
			int a=k;
			int b=n-1;
			System.out.print("[");
			for(int j=arr.length-1;j>x;j--) {
				if(i!=arr.length-1) {
					System.out.print(arr[a][b]+" ");
					a+=1;
					b-=1;
				}
				else if(i==arr.length-1) {
					System.out.print(arr[arr.length-1][arr.length-1]+" ");
				}
			}
			System.out.print("]");
			x++;
			System.out.println("");
			k+=1;
		}
	}
	public static void main(String[] args) {
		q1 b=new q1();
		int [][]arr= {{1,2,4},{3,7,9},{8,5,6}};
		b.antidiagonal(arr);
	}
}
