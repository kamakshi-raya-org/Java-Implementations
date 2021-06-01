package lab11;

public class obj2main {

	public static void main(String[] args) {
		obj2 b=new obj2();
		int arr[][]=new int[5][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=0;
			}
		}
		b.printgrid(arr);
	}

}
