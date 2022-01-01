package schoolManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class SchoolManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);


        Student tamasha = new Student(1,"Tamasha",4);
        Student rakshith = new Student(2,"Rakshith Vasudev",12);
        Student rabbi = new Student(3,"Rabbi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);




        School shikkha = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        shikkha.addTeacher(megan);


        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("shikkha has earned $"+ shikkha.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL MANAGEMENT SYSTEM----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("shikkha has spent for salary to " + lizzy.getName()
        +" and now has $" + shikkha.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("shikkha has spent for salary to " + vanderhorn.getName()
                +" and now has $" + shikkha.getTotalMoneyEarned());


        System.out.println(rakshith);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);
	}

}
