package lab14;

public class CSE extends Bennett {
	CSE(){
		super();
		NumStu=600;
		NumProg=3;
	}
	//this display() overrides the display() from Bennett class
	public void display() {
		System.out.println("CSE :");
		System.out.println("NumStu = "+NumStu);
		System.out.println("NumProg = "+NumProg);
	}
	public static void main(String[] args) {
		CSE c=new CSE();
		//calls display() from class CSE
		c.display();
	}

}
