package lab11;
public class obj15 {
	public void rowisesort(int[][]arr) {
		int s=0,temp;
		System.out.println("Input:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println("");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i][j]>arr[i][k]) {
						temp=arr[i][j];
						arr[i][j]=arr[i][k];
						arr[i][k]=temp;
					}
				}
			}
		}
		System.out.println("Output:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println("");
		}
	}
}

