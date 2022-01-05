package bankSystem;
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount("ABC", "XY0001");
		obj.showMenu();
	}
}

class BankAccount{
	double balance;
	double previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid)
	{
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(double amount)
	{
		if(amount != 0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(double amount)
	{
		balance = balance - amount;
		previousTransaction = -amount;
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited: " + previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No transaction occurred");
		}
	}
	
	void showMenu()
	{
		char option ='\0';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is: " + customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("=========================================");
			System.out.println("Enter an option");
			System.out.println("=========================================");
			option = scan.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
				case 'A':
					System.out.println("---------------------------------");
					System.out.println("Balance: " + balance);
					System.out.println("---------------------------------");
					System.out.println("\n");
					break;
				
				case 'B':
					System.out.println("----------------------------------");
					System.out.println("Enter an amount to deposit: ");
					System.out.println("----------------------------------");
					double depositAmount = scan.nextDouble();
					deposit(depositAmount);
					System.out.println("\n");
					break;
				
				case 'C':
					System.out.println("----------------------------------");
					System.out.println("Enter an amount to withdraw: ");
					System.out.println("----------------------------------");
					double withdrawnAmount = scan.nextDouble();
					withdraw(withdrawnAmount);
					System.out.println("\n");
					break;
				
				case 'D':
					System.out.println("----------------------------------");
					System.out.println("Previous Transaction: ");
					getPreviousTransaction();
					System.out.println("----------------------------------");
					System.out.println("\n");
					break;
				
				case 'E':
					System.out.println("*********************************");
					break;
					
				default:
					System.out.println("Invalid Option. Please enter again");
					break;
			}
		}while(option != 'E');
		
		System.out.println("Thank you for using our services.");
		
		scan.close();
	}
		
}