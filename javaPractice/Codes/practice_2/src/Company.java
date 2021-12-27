import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Company {
	private ArrayList<Employee> employees;
	private BankAccount mainAccount;
	private double lowestBasicSalary;
	private double totalRequiredMonthlySalary;
	private double totalPaidSalary;
	private static final double salaryIncrease = 5000.0;
	
	Company()
	{
		this.mainAccount = new BankAccount(AccountType.CURRENT, "Foogle LLC", 1111, 0.0, "Fyamoli");
		this.lowestBasicSalary = 0.0;
		this.totalRequiredMonthlySalary = 0.0;
		this.totalPaidSalary = 0.0;
		this.initEmployees();
	}
	
	private void initEmployees()
	{
		this.employees = new ArrayList<Employee>();
		this.employees.add(new Employee("David", Grades.GRADE_ONE, "House No: 2, Road No: 3/k, Shelton, Akha", "000-888-777", this.getGradeBasedSalary(Grades.GRADE_ONE), new BankAccount(AccountType.SAVINGS, "Foogle LLC", 9990, 20000.0, "Fyamoli")));
        this.employees.add(new Employee("Ron", Grades.GRADE_TWO, "House No: 3, Road No: 20, Moris Bay, Rika", "021-338-213", this.getGradeBasedSalary(Grades.GRADE_TWO), new BankAccount(AccountType.SAVINGS, "Foogle LLC", 9991, 55000.0, "Rika")));
        this.employees.add(new Employee("Elen", Grades.GRADE_THREE, "House No: 22, Road No: 1, Melron, Akha", "897-111-376", this.getGradeBasedSalary(Grades.GRADE_THREE), new BankAccount(AccountType.CURRENT, "Foogle LLC", 9992, 0.0, "Fyamoli")));
        this.employees.add(new Employee("Enilo", Grades.GRADE_THREE, "House No: 12, Road No: 36, Rieno, Rika", "439-723-724", this.getGradeBasedSalary(Grades.GRADE_THREE), new BankAccount(AccountType.SAVINGS, "Foogle LLC", 9993, 65.25, "Rika")));
        this.employees.add(new Employee("Sovec", Grades.GRADE_FOUR, "House No: 93, Road No: 6, Shelton, Akha", "169-000-793", this.getGradeBasedSalary(Grades.GRADE_FOUR), new BankAccount(AccountType.CURRENT, "Foogle LLC", 9994, 6000.50, "Fyamoli")));
        this.employees.add(new Employee("Menisich", Grades.GRADE_FOUR, "House No: 132, Road No: 7, Shelton, Akha", "194-999-321", this.getGradeBasedSalary(Grades.GRADE_FOUR), new BankAccount(AccountType.SAVINGS, "Foogle LLC", 9995, 11111.0, "Fyamoli")));
        this.employees.add(new Employee("Tomaik", Grades.GRADE_FIVE, "House No: 9, Road No: 12, Moris Bay, Rika", "044-907-100", this.getGradeBasedSalary(Grades.GRADE_FIVE), new BankAccount(AccountType.SAVINGS, "Foogle LLC", 9996, 0.0, "Rika")));
        this.employees.add(new Employee("Vesili", Grades.GRADE_FIVE, "House No: 36, Road No: 2/A, Shelton, Akha", "123-007-913", this.getGradeBasedSalary(Grades.GRADE_FIVE), new BankAccount(AccountType.CURRENT, "Foogle LLC", 9997, 12367.0, "Fyamoli")));
        this.employees.add(new Employee("Neum", Grades.GRADE_SIX, "House No: 1, Road No: 5/M, Moisen, Menum", "820-078-666", this.getGradeBasedSalary(Grades.GRADE_SIX), new BankAccount(AccountType.SAVINGS, "Foogle LLC", 9998, 0.0, "Menum")));
        this.employees.add(new Employee("Miral", Grades.GRADE_SIX, "House No: 6, Road No: 6, Moisen, Menum", "936-217-006", this.getGradeBasedSalary(Grades.GRADE_SIX), new BankAccount(AccountType.CURRENT, "Foogle LLC", 9999, 0.0, "Menum")));
	}
	
	private double getGradeBasedSalary(Grades grade)
	{
		if(grade == Grades.GRADE_ONE)
		{
			return this.lowestBasicSalary + (Company.salaryIncrease * 5);
		}else if(grade == Grades.GRADE_TWO){
			return this.lowestBasicSalary + (Company.salaryIncrease * 4);
		}else if(grade == Grades.GRADE_THREE) {
			return this.lowestBasicSalary + (Company.salaryIncrease * 3);
		} else if(grade == Grades.GRADE_FOUR) {
			return this.lowestBasicSalary + (Company.salaryIncrease * 2);
		} else if(grade == Grades.GRADE_FIVE) {
			return this.lowestBasicSalary + Company.salaryIncrease;
		} else {
			return this.lowestBasicSalary;
		}
	}
	
	private void setEmployeeSalaries()
	{
		Employee employee;
		double basic;
		for (int i = this.employees.size() - 1; i >= 0; i--)
		{
			employee = this.employees.get(i);
			basic = this.getGradeBasedSalary(employee.getGrade());
			this.totalRequiredMonthlySalary += basic;
			employee.setSalary(basic + (basic * 0.2) + (basic * 0.15));
		}
	}
	
	public void setMainAccount(BankAccount mainAccount)
	{
		this.mainAccount = mainAccount;
	}
	
	public BankAccount getMainAccount()
	{
		return this.mainAccount;
	}
	
	public void setLowestBasicSalary(double lowestBasicSalary)
	{
		this.lowestBasicSalary = lowestBasicSalary;
		this.setEmployeeSalaries();
	}
	
	public double getLowestBasicSalary()
	{
		return this.lowestBasicSalary;
	}
	
	public void printEmployeeInfo()
	{
		System.out.println("Hello World");
	}
	
	public synchronized void fundTransfer(BankAccount foogleAccount)
	{
		
	}
	
}
