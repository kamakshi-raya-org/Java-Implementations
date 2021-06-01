package lab14;

public class SS extends Calculator {
	public void Square(int a) {
		System.out.println("Square() from class SS");
	}
	public static void main(String[]args) {
		Calculator s=new Calculator();
		s.Square(0);
	}
}
