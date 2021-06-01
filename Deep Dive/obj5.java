package lab11;

public class obj5 {
	public void maxmin(int arr[]) {

		for(int i=0;i<arr.length;i++) {
			int s=0;
			int k=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					s+=1;
				}
				else if(arr[i]<arr[j]) {
					k+=1;
				}
			}
			if(s==arr.length-1) {
				System.out.println("Maximum value for the above array = "+arr[i]);
			}
			else if(k==arr.length-1) {
				System.out.println("Minimum value for the above array = "+arr[i]);
			}
		}
	}
}
