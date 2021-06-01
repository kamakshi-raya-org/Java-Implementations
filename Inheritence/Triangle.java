package lab16;

public class Triangle extends Shape {
	int base=5;
	int height=10;
	public void area() {
		int area=base*height/2;
		System.out.println("Area of the triangle is "+area);
	}
}
//refer main.java for all the main methods