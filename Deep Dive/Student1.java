package lab9;

public class Student1 {
	private static int studentId=550;
	private String lastName;
	private String firstName;
	private String studentName;
	private char studentType;
	Student1(){
		
	}
	Student1(char type,String fname,String lname){
		studentType=type;
		firstName=fname;
		lastName=lname;
		studentName=firstName+lastName;

	}
	public void displayDetails() {
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Type: "+studentType);
		studentId++;
	}
public static void main(String[]args) {
	Student1 s1=new Student1('D',"Bony","Thomas");
	Student1 studentOne;
	studentOne=s1;
	studentOne.displayDetails();
	Student1 s2=new Student1('H',"Dinil","Bose");
	Student1 studentTwo;
	studentTwo=s2;
	studentTwo.displayDetails();
}
}
