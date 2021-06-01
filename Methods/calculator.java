package lab_7;

public class calculator {
	static float a,b;
	public static  void addition() {
		float p=a+b;
		System.out.println(p);
	}
	public static float subtraction() {
		System.out.println("subtraction:");
		return a-b;
	}
    public static void multiplication(float a,float b) {
    	System.out.println(a*b);   	
    }
    public static float division(float a,float b) {
    	System.out.println("division :");
    	return a/b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
