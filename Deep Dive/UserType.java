package lab9;

public class UserType {
	private String name;
	UserType(){
		name="Student";
	}
	UserType(String name){
		this.name=name;
	}
public static void main(String[]args) {
	UserType s1=new UserType();
	UserType s2=new UserType("Faculty");
	System.out.println(s1.name);
	System.out.println(s2.name);
}
}
