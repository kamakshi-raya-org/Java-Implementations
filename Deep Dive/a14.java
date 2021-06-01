package lab9;

public class a14 {
	/**
	* This java file contains a class having the attributes of a
	* Customer and has a parameterized constructor to initialize the * instance variables.
	* Demonstrates the usage of static block, static variables and
	static
	 * methods
	 */
	/**
	* This class has four attributes customerId ,customerName, * customerTelNo, customerEmail and uses the parameterized
	constructor
	* to initialize the instance variables
	* Also declare a static variable named noOfCustomers which help us * to keep track of the number of customer objects created during
	* runtime.
	 * Date: 20-Apr-2007
	 *
	* @version 1.0 */

	
	     /* Static block – A block of statements written to
	      * initialize static variables
	      * The statements inside the static block will get
	      * executed only once when the class is loaded
	* by the JVM */
	static
	 {
	/* Assume that we already have 50 customers. Hence the * static variable noOfCustomers has to be initialized * to 50
	*/
	noOfCustomers = 50;
	     }
	/* declaration of instance variables
	* these variables are available for every objects created */
	private int customerId;
	private String customerName;
	private int customerTelNo;
	private String customerEmail;
	/* declaration of static variables (class variables ) * this is common for all the objects created
	*/
	static int noOfCustomers;
	/**
	* Parameterized Constructor: Creates a customer Object and
	 * initializes the instances variables with the supplied values.
	* Since the method arguments name and instance variable names * are similar we have to use this keyword which has a
	* reference to the current object
	*/
	a14(int customerId, String customerName, int customerTelNo, String customerEmail)
	     {
	           this.customerId= customerId;
	           this.customerName= customerName;
	 this.customerTelNo= customerTelNo;
	this.customerEmail= customerEmail;
	           /* increment the static variable by one since
	            * we have created one customer object */
	noOfCustomers++;
	     }
	     /**
	     *This method displays the customer details
	     *@param void
	     *@return void
	 */
	public void displayCustomer()
	{
	System.out.println("Customer Id :" + customerId); 
	System.out.println("Customer Name :" + customerName);
	System.out.println("Customer TelNo : " + customerTelNo); 
	System.out.println("Customer Email Id : " + customerEmail); 
	System.out.println(noOfCustomers);}
	/**
	*This method displays the count of
	* the number of customer objects created during runtime. * This is static method (class method) which can access * only static variables
	*@param void
	*@return void
	*/
	public static void customerCount()
	{
	System.out.println("No of Customers : "+ noOfCustomers); 
	}
	/**
	       * Creates an object of the Customer class and
	* and invokes the method displayCustomer using the object to * print the customer details
	      * @paramargs  Command line arguments
	      */
	     public static void main(String[]args)
	{
	//creating customer object one
	a14 c1=new a14(1001, "John", 465364,"John@gmail.com");
	//creating customer object two
	a14 c2=new a14(1002, "Jack", 764755, "Jack@yahoo.com");
	     //display the count of customer objects
	     customerCount();
	     // c2.displayCustomer();
	     c2.displayCustomer();
	} 
}
