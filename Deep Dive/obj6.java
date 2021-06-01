package lab11;

public class obj6 {
	public void duplicate(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Element: "+arr[i]);
				}
			}
		}
	}
}
