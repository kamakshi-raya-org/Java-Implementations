package lab16;
interface speed{
	int speed=20;
	void distance();
}

interface distance{
	int distance=10;
	void speed();
}
public class q1 implements speed, distance {
	int time=10;
	public void distance() {
		int distance=speed*time;
		System.out.println("distance travelled by the vehicle is "+distance);
	}
	public void speed() {
		int speed=distance/time;
		System.out.println("speed of the vehicle is "+distance);
	}
	public static void main(String[]args) {
		q1 d=new q1();
		d.distance();
		d.speed();
	}
}
