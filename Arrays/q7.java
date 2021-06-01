package lab13;
public class q7 {
	public static void main(String[] args) {
		int []arr= {3,4,2,2,2};
		int s=0,maj=arr[0],ind=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					s++;
				}
				if(s>=arr.length/2) {
					maj=arr[i];
					ind=i;
				}
			}
		}
		System.out.println("The entered array:");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
		System.out.println("");
		if(s>=arr.length/2) {
			System.out.println("majority element: "+maj);
		}
		else {
			System.out.println("majority element doesnt exist");
		}
			
	}
}
	