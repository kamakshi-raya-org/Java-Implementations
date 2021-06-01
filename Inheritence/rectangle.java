package lab14;

public class rectangle extends Geometry{
	//method overloading
	public void Area(float length, float breadth) {
		float area=length*breadth;
		System.out.println("Area of the rectangle is "+area);
	}
	//method overloading
	public void Perimeter(float length, float breadth) {
		float peri=2*length*breadth;
		System.out.println("Perimeter of the rectangle is "+peri);
	}
	public static void main(String[]args) {
		rectangle rectangle=new rectangle();
		rectangle.Area(4,4);
	}
}
