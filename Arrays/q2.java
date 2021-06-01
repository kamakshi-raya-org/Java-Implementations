package lab13;
public class q2 {
	public static void main(String[] args) {
		int arr[]={23, 2, 100, 45, -5, 7, -2, 9};
		System.out.println("The entered array:");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
		int n=arr.length,temp; 
        int max=arr[n-1]; 
        for (int i=n-2;i>=0;i--) { 
            temp=arr[i]; 
            if(arr[i]<max) {
            arr[i]=max; 
            }
            if(max<temp) {
            	max=temp; 
            }            
        } 
        System.out.println("");
        System.out.println("The modified array:"); 
        System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		 System.out.print("]");
	}
}
