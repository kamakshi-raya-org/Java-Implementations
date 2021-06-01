package lab14;

public class SNU extends IndianUniversity {
	SNU(){
		NumStu=4000;
		NumProg=4;
		NumUni++;
	}
	public void display() {
		System.out.println("SNU :");
		System.out.println("NumStu = "+NumStu);
		System.out.println("NumProg = "+NumProg);
		System.out.println("NumUni = "+NumUni);
	}
}
