package lab16;

public class main {

	public static void main(String[] args) {
		//question 2 main method
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		r.area();
		t.area();
		//question 3 main method
		q3_child_class a=new q3_child_class();
		//question 5 main method
		q5_parent b=new q5_child();
		b.show(2);
		//question 7 main method
		q7 q=new q7();
		q.area(4);
		q.area(2,3);
	}

}
