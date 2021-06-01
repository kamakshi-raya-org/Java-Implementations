package lab14;

public class IITB extends IndianUniversity {
	IITB(){
		NumStu=10000;
		NumProg=15;
		NumUni++;
	}
	public void display() {
		System.out.println("IITB :");
		System.out.println("NumStu = "+NumStu);
		System.out.println("NumProg = "+NumProg);
		System.out.println("NumUni = "+NumUni);
	}
}
