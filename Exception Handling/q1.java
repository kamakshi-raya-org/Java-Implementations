package lab18;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		 {
		 int arr[]={4,4,5};
		 arr[6]=90;
		 }
		catch(ArrayIndexOutOfBoundsException ex)
		 {
			System.out.println(ex);
		 System.out.println("Array Index out of bound");
		 }
		 catch(IndexOutOfBoundsException ex)
		 {
		 System.out.println("Index out of bound");
		 }
		//if we make catch(ArrayIndexOutOfBoundsException ex) after the catch(IndexOutOfBoundsException ex) 
		//Unreachable catch block for ArrayIndexOutOfBoundsException.
		//It is already handled by the catch block for IndexOutOfBoundsException

		
	}

}
