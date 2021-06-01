package lab13;
public class q5 {
	public static void main(String[] args) {
		int []arr={20, 19, 34, 53, 25, 0, 11};
		int k=0;
		System.out.println("The entered array:");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
		System.out.println("");
		int []c=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int s=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					s++;
				}
			}
			if(s==arr.length-(i+1)) {
				c[k]=arr[i];
				k++;
			}
		}
		System.out.println("Leaders of the array: ");
		System.out.print("[");
		for(int i=0;i<k;i++) {
			System.out.print(c[i]+", ");
		}
		System.out.print("]");
	}

}
