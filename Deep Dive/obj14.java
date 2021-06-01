package lab11;

public class obj14 {
	public void rotate(int[]arr) {
		int arr1[]=new int [arr.length];
		System.out.println("Input array:");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
		for(int i=0;i<arr.length-1;i++) {
			arr1[i+1]=arr[i];
		}
		arr1[0]=arr[arr.length-1];
		System.out.println("");
		System.out.println("Rotated array:");
		System.out.print("[");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+", ");
		}
		System.out.print("]");
	}
}
