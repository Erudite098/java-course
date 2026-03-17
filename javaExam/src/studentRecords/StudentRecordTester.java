package studentRecords;

import java.util.Scanner;

public class StudentRecordTester {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome, Admin.\n");
		
		System.out.print("Enter student name: ");
		String studentName = scanner.next();
		
		System.out.print("Enter student age: ");
		int age = scanner.nextInt();
		
		System.out.print("Enter student ID: ");
		String studentID = scanner.next();
		
		System.out.print("Enter course: ");
		String course = scanner.next();
		
		Student student = new Student(studentName, age, studentID, course);
		
		student.displayInfo();
	}

}		
