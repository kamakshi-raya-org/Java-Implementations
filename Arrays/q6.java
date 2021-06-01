package lab13;
public class q6 {
	public static void main(String[] args) {
		int []arr={12, 5, 15, 12, 5, 22, 4, 15};
		int[]c=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c[i]++;
					}
			}
		}
		int n=arr.length;
		for(int i=0;i<c.length;i++) {
			n-=c[i];
		}
		System.out.println("new length of the updated array: "+n);
	}
}
