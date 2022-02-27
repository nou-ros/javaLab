class Employee{
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;
   
    Employee(int ID, String firstName, String lastName, int salary){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
   
    public int getID(){
        return ID;
    }
   
    public String getFirstName(){
        return firstName;
    }
   
    public String getLastName(){
        return lastName;
    }
   
    public String getName(){
        return firstName + " " + lastName;
    }
   
    public int getSalary(){
        return salary;
    }
   
    public void setSalary(int salary){
        this.salary = salary;
    }
   
    public int  getAnnualSalary(){
        return salary * 12;
    }
   
    public int raiseSalary(int percent){
        salary += (salary * percent)/100;
        return salary;
    }
   
    public String toString(){
        return "Employee [id = " + ID + ", name = " + firstName + " " + lastName + ", salary= " + salary + "]";
    }
}


public class TestEmployee{
    public static void main(String args[]){
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);
       
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("ID is : " + e1.getID());
        System.out.println("first name is : " + e1.getFirstName());
        System.out.println("last name is : " + e1.getLastName());
        System.out.println("salary is : " + e1.getSalary());
        System.out.println("Full Name is : " + e1.getName());
        System.out.println("Annual salary is : " + e1.getAnnualSalary());
       
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}
