package lab6;

public class EmployeeGrade2 {
	
	private int employeeNo;
	private String employeeName;
	private float customer1Feedback,customer2Feedback,customer3Feedback,averageFeedback;
	private char grade;
	
	public EmployeeGrade2(String Name,int No,float c1F,float c2F,float c3F) {
		employeeName = Name;
		employeeNo = No;
		customer1Feedback = c1F;
		customer2Feedback = c2F;
		customer3Feedback = c3F;
	}
	
	public void calculateAverageFeedback() {
		averageFeedback = (customer1Feedback+customer2Feedback+customer3Feedback)/3;
	}public void calculateGrade() {
		if(averageFeedback>=4.5f) {
			grade = 'A';
		}else if(averageFeedback>=3f && averageFeedback<4.5f) {
			grade = 'B';
		}else {
			grade = 'C';
		}
	}
	
	public void displayinfo() {
		System.out.println("EmployeeName: "+employeeName);
		System.out.println("EmployeeNo: "+employeeNo);
		System.out.println("EmployeeFeedback: "+averageFeedback);
		System.out.println("EmployeeGrade: "+grade);
	}

}
