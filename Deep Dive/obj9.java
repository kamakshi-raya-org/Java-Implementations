package lab11;

public class obj9 {
	public void common(int arr1[], int arr2[]) {
		for(int i=0; i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("Common element is: "+arr2[j]);
				}
			}
		}
	}
}