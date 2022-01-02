package studentManagementSystem;
import java.util.Scanner;


public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance;
    private static int costOffCourse = 700;
    private static int id = 1000;
    Scanner scan = new Scanner(System.in);

    // constructor for student's name and year
    public Student(){
        System.out.println("Enter first name: ");
        this.firstName = scan.nextLine();
        System.out.println("Enter last name: ");
        this.lastName = scan.nextLine();
        System.out.println("1. Freshman\n2. Sophemore\n3. Junior\n4. Senior\nEnter class level: ");
        this.gradeYear = scan.nextLine();
        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
    }
    // Generate an ID
    private String setStudentID(){
        // Grade level + ID
        id++;
        this.studentId = gradeYear + "" + id;
        return this.studentId;
    }

    // Enroll in courses
    public void enroll(){
        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            String course = scan.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance += costOffCourse;
            }
            else{ 
                System.out.println("Course enrolment successfull!");
                break; 
            }
        }while(1 != 0);
    }

    // View Balance
    public void viewBalance(){
        System.out.println("Your current balance: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter payment: $");
        int payment = scan.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalance();
    }

    // Show status
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName + 
            "\nGrade Level: " + gradeYear +
            "\nStudent ID: " + studentId + 
            "\nCourses Enrolled:  " + courses + 
            "\nCurrent Balance: $" + tuitionBalance;
    }
}
