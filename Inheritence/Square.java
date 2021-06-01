package lab14;

public class Square extends Geometry {
	public void Area() {
		double Area=edge*edge;
		System.out.println("Area of the square is "+Area);
	}
	public void Perimeter() {
		float peri=4*edge;
		System.out.println("Perimeter of the square is "+peri);
	}
	public static void main(String[]args) {
		Geometry square=new Square();
		square.edge=4;
		square.Area();
		square.Perimeter();
	}
	}

