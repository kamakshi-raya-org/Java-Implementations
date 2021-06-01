package lab16;

public class Rectangle extends Shape {
	int length=10;
	int breadth=5;
	public void area(){
		int area=length*breadth;
		System.out.println("Area of the rectangle is "+area);
	}
}
//refer main.java for all the main methods