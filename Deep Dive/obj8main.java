package lab11;
import java.util.Scanner;
public class obj8main {

	public static void main(String[] args) {
		obj8 b=new obj8();
		int arr1[][], arr2[][];
		Scanner in=new Scanner(System.in);
		System.out.println("Input number of rows of matrix :");
		int r=in.nextInt();
		System.out.println("Input number of columns of matrix :");
		int c=in.nextInt();
		arr1=new int[r][c];
		arr2=new int[r][c];
		System.out.println("Input elements of first matrix :");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr1[i][j]=in.nextInt();
			}
		}
		System.out.println("Input elements of second matrix :");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr2[i][j]=in.nextInt();
			}
		}
		b.SumOfMatrices(arr1, arr2);
	}

}

