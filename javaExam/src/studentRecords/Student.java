package studentRecords;

public class Student extends Person implements Displayable{
	

	/* Member variables */
	private String studentID;
	private String course;
	
	/* Constructor */
	public Student(String name, int age, String studentID, String course) {
		super(name, age);
		this.studentID = studentID;
		this.course = course;
	}

	@Override
	public void displayInfo() {
		System.out.println("\n=========================\n"
							+ "+  STUDENT INFORMATION  +\n"
							+ "=========================\n");
        System.out.println("ID     : " + this.studentID);
        System.out.println("Name   : " + getName());
        System.out.println("Age    : " + getAge());
        System.out.println("Course : " + this.course);	
	}
	
}
