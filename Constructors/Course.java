package lab6;

public class Course {
	
	private static int studentCount;
	private int courseId;
	private int studentId;
	
	static{
		studentCount=100;
		}
		Course() {
		studentCount++;
		studentId = studentCount;
		}
		public static int getStudentCount (){
			return studentCount;
		}
		public int getCourseId () {
			return courseId;
		}
		public void setCourseId (int courseId){
			this.courseId = courseId;
		}
		public int getStudentId () {
			return studentId;
		}

}
