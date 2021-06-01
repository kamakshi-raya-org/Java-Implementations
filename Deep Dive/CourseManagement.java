package lab9;

public class CourseManagement {

	public static void main(String[] args) {
		int studentid=700;
		char studentType='F';
		Student student=new Student();
		student.setStudentId(studentid);
		System.out.println(student.getStudentId());
		student.setStudentType(studentType);
		System.out.println(student.getStudentType());

	}

}
