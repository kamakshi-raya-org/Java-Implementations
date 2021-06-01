package lab_7;

public class PenPrice
{
	static double pen1, pen2, pen3, price, spen1, spen2, spen3;

	static
	{
		pen1 = 25;
		pen2 = 35;
		pen3 = 40;
		spen1 = pen1;
		spen2 = pen2;
		spen3 = pen3;
		price = pen1 + pen2 + pen3;
	}

	public void costPrice()
	{
		pen1 = pen1 + ((8.0/100) * pen1);
		pen2 = pen2 + ((8.0/100) * pen2);
		pen3 = pen3 + ((8.0/100) * pen3);
	}
	public void sellingPrice()
	{
		spen1 = pen1 + ((12.0/100) * pen1);
		spen2 = pen2 + ((12.0/100) * pen2);
		spen3 = pen3 + ((12.0/100) * pen3);	
	}

	public static void main(String[] args)
	{
		PenPrice pen = new PenPrice();
		for(int i = 1991; i <= 1999; i++)
		{
			System.out.println("For the year: " + i);
			System.out.println("Cost price of pen 1: " + pen1);
			System.out.println("Cost price of pen 2: " + pen2);
			System.out.println("Cost price of pen 3: " + pen3);
			pen.sellingPrice();
			System.out.println("Selling price of pen 1: " + spen1);
			System.out.println("Selling price of pen 2: " + spen2);
			System.out.println("Selling price of pen 3: " + spen3);
			System.out.println("Cost of three pens is " + (pen1 + pen2 + pen3));
			pen.costPrice();
		}
	}
}