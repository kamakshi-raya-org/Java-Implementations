package lab18;

public class q3main {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		q3 BTS =new q3();
		try
		{
			BTS.divide();
		}
		catch(ArithmeticException ecx)
		{
			System.out.println("exception is handled in main class !");
			throw ecx;
		}
		System.out.println("inside main");
	}

}
