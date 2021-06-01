package lab11;

public class obj12 {
		public void maxmin(int [] arr) {
			System.out.println("Original array:");
			System.out.print("[");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+", ");
			}
			System.out.print("]");
			System.out.println("");
			int arr1[]=new int[arr.length];
			int temp, ind1=0,ind2=1;
			for (int i= 0;i<arr.length;i++) {
	            for (int j=i+1;j<arr.length;j++){
	                if (arr[i] < arr[j]){
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
			}
			for(int j=0;j<arr.length/2;j++) {
				arr1[ind1]=arr[j];
				arr1[ind2]=arr[(arr.length)-1-j];
				ind1+=2;
				ind2+=2;
				}
			System.out.println("Array after arrangement:");
			
			System.out.print("[");
			for(int i=0;i<arr1.length;i++) {
				System.out.print(arr1[i]+", ");
			}
			System.out.print("]");
		}
	}

