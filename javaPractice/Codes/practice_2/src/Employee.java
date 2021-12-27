enum Grades {
	GRADE_ONE, GRADE_TWO, GRADE_THREE, GRADE_FOUR, GRADE_FIVE, GRADE_SIX
}

public class Employee {
	private String name;
	private Grades grade;
	private String address;
	private String mobile;
	private double salary;
	private BankAccount bankAccount;
	
	Employee(String name, Grades grade, String address, String mobile, double salary, BankAccount bankAccount)
	{
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.mobile = mobile;
		this.salary = salary;
		this.bankAccount = bankAccount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setGrade(Grades grade)
	{
		this.grade = grade;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public void setBankAccount(BankAccount bankAccount)
	{
		this.bankAccount = bankAccount;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Grades getGrade()
	{
		return this.grade;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public String getMobile()
	{
		return this.mobile;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public BankAccount getBankAccount()
	{
		return this.bankAccount;
	}
}
