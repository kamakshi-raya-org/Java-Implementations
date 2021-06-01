package lab11;

public class obj4main {

	public static void main(String[] args) {
		obj4 b=new obj4();
		int arr[]= {21,25,14,56,15,36,56,77,18,29,49};
		System.out.println("The original array:");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
		System.out.println("");
		b.newarray(arr);

	}

}
