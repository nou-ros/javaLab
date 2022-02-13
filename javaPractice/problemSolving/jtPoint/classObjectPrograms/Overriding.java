class Employee{
	public static int base = 10000;
	int salary(){
		return base;
	}
}


class Manager extends Employee{
	@Override
	int salary(){
		return base + 20000;
	}
}


class Clerk extends Employee{
	@Override
	int salary(){
		return base + 10000;
	}
}


public class Overriding{
	static void printSalary(Employee emp){
		System.out.println(emp.salary());
	}

	public static void main(String args[]){
		Employee obj = new Manager();
		System.out.println("Manager's salary : ");
		printSalary(obj);

		Employee obj2 = new Clerk();
		System.out.println("Clerk's salary: ");
		printSalary(obj2);
	}
}
