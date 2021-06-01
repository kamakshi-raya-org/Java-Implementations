package lab11;

public class obj8 {
	public void SumOfMatrices(int arr1[][], int arr2[][]) {
		int r=arr1.length;
		int c=arr1.length;
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println("");
		}
		
	}
}
