package lab9;

public class ElectricityBill {
	private int customerId;
	private String customerName;
	private float previousReading;
	private float currentReading;
	public void setcustomerId(int id) {
		customerId=id;
	}
	public int getcustomerId() {
		return customerId;
	}
	public void setcustomerName(String name) {
		customerName=name;
	}
	public int getcustomerName() {
		return customerId;
	}
	public void setpreviousReading(float reading) {
		previousReading=reading;
	}
	public int getpreviousReading() {
		return customerId;
	}
	public void setcurrentReading(float reading) {
		currentReading=reading;
	}
	public int getcurrentReading() {
		return customerId;
	}
	public void printDetails() {
		float n=currentReading-previousReading;
		System.out.println("Customer Id: "+customerId);
		System.out.println("Customer Name:"+customerName);
		System.out.println("No. Of Units: "+n);
	}
public static void main(String[]args) {
	ElectricityBill bill=new ElectricityBill();
	bill.setcustomerId(1207);
	bill.setcustomerName("Esha");
	bill.setpreviousReading(90);
	bill.setcurrentReading(100);
	bill.printDetails();
}

}
