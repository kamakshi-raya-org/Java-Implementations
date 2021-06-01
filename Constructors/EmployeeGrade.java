package lab6;

public class EmployeeGrade {
	
	private int employeeNo;
	private String employeeName;
	private float customer1Feedback,customer2Feedback,customer3Feedback,averageFeedback;
	private char grade;
	
	public EmployeeGrade(){
		employeeNo=101;
		employeeName="Ram";
		customer1Feedback=4.1f;
		customer2Feedback=4.0f;
		customer3Feedback=4.3f;
	}public void calculateAverageFeedback() {
		averageFeedback = (customer1Feedback+customer2Feedback+customer3Feedback)/3;
	}public void calculateGrade() {
		if(averageFeedback>=4.5f) {
			grade = 'A';
		}else if(averageFeedback>=3f && averageFeedback<4.5f) {
			grade = 'B';
		}else {
			grade = 'C';
		}
	}public void displayinfo() {
		System.out.println("EmployeeName: "+employeeName);
		System.out.println("EmployeeNo: "+employeeNo);
		System.out.println("EmployeeFeedback: "+averageFeedback);
		System.out.println("EmployeeGrade: "+grade);
	}

}
