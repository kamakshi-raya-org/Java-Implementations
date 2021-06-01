package lab11;
import java.util.*;
public class obj13 {
	public void sumzero(int []arr) {
		System.out.println("Input array:");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
		System.out.println("");
		int sum;
		int ln=0,rn=0;
		int x=0,y=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sum=arr[i]+arr[j];
				if(Math.abs(arr[x]+arr[y])>Math.abs(sum)){
					ln=i;
					rn=j;
					x=ln;
					y=rn;
				}
			}
		}
		System.out.println("Two elements whose sum is minimum are "+arr[ln]+" and "+arr[rn]);
	}
}
