package labass11E;

public class Question3 {
	public static void main(String[] args) {
		int[][] a= {{1,2},{2,3,4,5},{1},{0},{1,2,3,4,5,6,7,8}};
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Row = "+(i+1)+"  Column Length = "+a[i].length);
			System.out.println();
		}
	}
}
