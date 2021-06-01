package lab11;

public class obj10 {
	public void sumequals(int arr[], int s) {
		System.out.println("Pairs of elements and their sum:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==s) {
					System.out.println(arr[i]+" + "+arr[j]+" = "+s);
				}
			}
		}
	}
}
