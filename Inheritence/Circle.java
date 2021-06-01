package lab14;

public class Circle extends Geometry {
	public void Area() {
		double Area=3.14*radius*radius;
		System.out.println("Area of the circle is "+Area);
	}
	public void Perimeter() {
		double peri=2*radius*3.14;
		System.out.println("Perimeter of the circle is "+peri);
	}
public static void main(String[]args) {
	Geometry circle=new Circle();
	circle.radius=4;
	circle.Area();
	circle.Perimeter();
}
}
