package student;


public class PartTimeStudent extends Student {

	private int noOfCourse;

	public PartTimeStudent(int noOfCourse, String studentId, String studentName) {
		super(studentId, studentName);
		this.noOfCourse = noOfCourse;
	}

	public int getNoOfCourse() {
		return noOfCourse;
	}

	public void setNoOfCourse(int noOfCourse) {
		this.noOfCourse = noOfCourse;
	}
}