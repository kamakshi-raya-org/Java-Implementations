package lab5;
import java.util.Scanner;
public class obj2 {
		private String name;
		private int ram;
		private double length;
		private int pixel1;
		private int pixel2;
		private int battery;
		private int cost;
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRam() {
			return ram;
		}

		public void setRam(int ram) {
			this.ram = ram;
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public int getPixel1() {
			return pixel1;
		}

		public void setPixel1(int pixel1) {
			this.pixel1 = pixel1;
		}

		public int getPixel2() {
			return pixel2;
		}

		public void setPixel2(int pixel2) {
			this.pixel2 = pixel2;
		}

		public int getBattery() {
			return battery;
		}

		public void setBattery(int battery) {
			this.battery = battery;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}


		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please Enter the Details Below:");
			System.out.println("Phone Name: ");
			objective2 obj = new objective2();
			obj.setName(scan.next());
			System.out.println("RAM in GB: ");
			obj.setRam(scan.nextInt());
			System.out.println("Diagonal Screen length in inches: ");
			obj.setLength(scan.nextInt());
			System.out.println("MP of Front Cam: ");
		    obj.setPixel1(scan.nextInt());
			System.out.println("MP of Rear Cam: ");
			obj.setPixel2(scan.nextInt());
			System.out.println("Battery in mAh: ");
			obj.setBattery(scan.nextInt());
			System.out.println("Cost of the Phone: ");
			obj.setCost(scan.nextInt());
			
			
	        System.out.println("Name: "+obj.getName()); 
	        System.out.println("RAM: "+obj.getRam()); 
	        System.out.println("Diag Screen Length: "+obj.getLength()); 
	        System.out.println("MP Front Cam: "+obj.getPixel1()); 
	        System.out.println("MP Rear Cam: "+obj.getPixel2());
	        System.out.println("Battery: "+obj.getBattery());
	        System.out.println("Price of Phone: "+obj.getCost());
	    } 

			

		}





