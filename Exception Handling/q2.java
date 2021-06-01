package lab18;

public class q2 {
	int[][] c = new int[4][4];
	int[][] a= { {3,15,54,16} , {54,23,21,75} , {0,3,51,0} , {23,0,43,98}};
	int[][] b= { {15,19,66,58} , {13,87,11,13} , {0,19,86,95} , {3,0,57,99}};
	void ndvi() {
		try
		 {
			for (int i = 0; i < 4; i++) 
			{
		           for (int j = 0; j < 4; j++)
		           {
		               c[i][j] = (b[i][j]-a[i][j])/(b[i][j]+a[i][j]) ;
		           }
		     }
			for (int i = 0; i <4; i++) 
			{
		           for (int j = 0; j < 4 ; j++) 
		           {
		               System.out.print(c[i][j] + " ");
		           }
		           System.out.println();
		    }
		 
		 }
		 catch(ArithmeticException e)
		 {
		 System.out.println(" exception !");
		 System.out.println(e);
		 }	 
		catch(Exception ex)
		{
			System.out.println("common task completed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q2 obj=new q2();
		obj.ndvi();
	}

}
