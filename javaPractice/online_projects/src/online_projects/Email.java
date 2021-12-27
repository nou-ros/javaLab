package online_projects;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	// Constructor to receive the first and last name
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department - return the department
		this.department = setDepartment();
//		System.out.println("Department: " + this.department);
		
		//Call a a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() 
		+ "@" + department + companySuffix;
//		System.out.println("Your email is: " + email);
	}
	
	//Ask for the department
	private String setDepartment()
	{
		System.out.println("New worker: " + firstName + ". Department Codes:\n1. for Sales\n2. for Development \n3. for"
				+ " Accounting\n0. for none\nEnter department code: ");
		Scanner scan = new Scanner(System.in);
		int depChoice = scan.nextInt();
		if(depChoice == 1) { return "sales"; }
		else if(depChoice == 2) { return "dev"; }
		else if(depChoice == 3) {return "acct"; }
		else { return ""; }
	}
	
	//Generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefjhijklmnopqrstuvwxyz123456789!@#$%&";
		char[] password = new char[length];
		for(int i=0; i<length; i++)
		{
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	//get mailbox capacity
	public int getMailboxCapacity() { return mailboxCapacity; };
	
	//get alternate email
	public String getAlternateEmail() { return alternateEmail; };
	
	//get password
	public String getPassword() { return password; };
	
	
	//show all info
	public String showInfo()
	{
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb"; 
	}
}
