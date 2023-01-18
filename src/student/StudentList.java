package student;

public class StudentList {
	public static void main (String[] args) {

		// Student s1 = new Student("s1", "ronak");

		Student[] studentList = new Student[3];

		studentList[0] = new Student("s1", "ronak");
		studentList[1] = new Student("s2", "john");
		studentList[2] = new Student("s3", "kevin");

		for (int i = 0; i < studentList.length; i++){
			System.out.println(studentList[i].getStudentName());
		}

	}
}
