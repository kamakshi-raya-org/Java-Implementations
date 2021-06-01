package lab9;
public class Student {
	private int studentId;
	private char studentType;
	public void setStudentId(int id) {
		studentId=id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentType(char type) {
		studentType=type;
	}
	public char getStudentType() {
		return studentType;
	}
	Student(){
		studentId=10;
		studentType='F';
	}

}
