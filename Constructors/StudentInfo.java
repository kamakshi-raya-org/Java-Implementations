package lab6;

public class StudentInfo {

	public static void main(String[] args) {
		System.out.println("No. of students already in the course : " +Course.getStudentCount());
		Course student = new Course ();
				// Setting the courseId for the student
		student.setCourseId(1001);
		System.out.println ("Student ID : " +student.getStudentId() + " Course ID: "+student.getCourseId());
		System.out.println ("Student Count: "+Course.getStudentCount());
				Course student1=new Course();
				student1.setCourseId(1002);
				System.out.println ("Student ID : " +student1.getStudentId() + " Course ID: "+student1.getCourseId());
				System.out.println ("Student Count: "+Course.getStudentCount());
				System.out.println ("Student Count: "+student1.getStudentCount());
		}
	}

