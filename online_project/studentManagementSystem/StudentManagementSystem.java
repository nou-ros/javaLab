package studentManagementSystem;
import java.util.Scanner;
/*
 * How many new students will add to the database
 * enter name and year of student
 * student will have 5-digit unique ID, with the first number being grade level
 * students courses: 
 * History 101, Mathematics 101, English 101, Chemistry 101, Computer Science 101
 * Each course costs $600 to enroll
 * student will view balance and pay the tuition
 * will show status of student name, ID, courses enrolled, and balance. 
 */

public class StudentManagementSystem {

	public static void main(String[] args) {
		// Create n number of new students
		System.out.println("Enter number of new students to enroll: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		Student students[] = new Student[number];
		for (int n = 0; n < number; n++){
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		scan.close();
		for (int n = 0; n < number; n++){
			System.out.println(students[n]);
		}
	}
}