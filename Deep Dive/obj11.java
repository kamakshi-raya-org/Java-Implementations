package lab11;

public class obj11 {
	public void arrange(int []arr) {
		int arr1[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0 ) {
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0 && j<arr1.length) {
				arr1[j]=arr[i];
				j++;
			}
		}
		System.out.println("Original Array:");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
		System.out.println("");
		System.out.println("New Array:");
		System.out.print("[");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+", ");
		}
		System.out.print("]");
	}
}
