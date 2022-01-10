package atmSystem;
import java.util.Scanner;


public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Bank theBank = new Bank("Bank of Asia");
		
		// add a user, which also creates a saving account
		User aUser = theBank.addUser("John", "Doe", "1234");
		
		// Add a checking account for our user
		Account newAccount = new Account("Checking", aUser, theBank);
		aUser.addAccount(newAccount);
		theBank.addAccount(newAccount);
		
		User curUser;
		while(true) {
			// stay in the login prompt until successful login
			curUser = ATM.mainMenuPrompt(theBank, scan);
			
			// stay in the main menu until user quits
			ATM.printUserMenu(curUser, scan);
		}
	}
	
	/**
	 * Print the ATM's login menu
	 * @param theBank  the Bank object whose accounts to use
	 * @param scan     for user input
	 * @return 		   the authenticated user object
	 */
	public static User mainMenuPrompt(Bank theBank, Scanner scan) {
		String userID;
		String pin;
		User authUser;
		
		// prompt the user for user ID/pin combination until the correct combination
		do {
			System.out.printf("\n\nWelcom to %s\n\n", theBank.getName());
			System.out.println("Enter user ID: ");
			userID = scan.nextLine();
			System.out.print("Enter pin: ");
			pin = scan.nextLine();
			
			// get the user based on ID and pin
			authUser = theBank.userLogin(userID, pin);
			if(authUser == null) {
				System.out.println("Incorrect user ID/Pin combination.");
				System.out.println("Please try again");
			}
		}while(authUser == null); // continue looping until successful login
		
		return authUser;
	}
	
	public static void printUserMenu(User theUser, Scanner scan) {
		//print a summary of the user's account
		theUser.printAccountsSummary();
		
		// init
		int choice;
		
		//user menu
		do {
			System.out.printf("Welcome %s, what would you like to do?", theUser.getFirstName());
			System.out.println(" 1) Show account transaction history");
			System.out.println(" 2) Withdrawl");
			System.out.println(" 3) Deposit");
			System.out.println(" 4) Transfer");
			System.out.println(" 5) Quit");
			System.out.println();
			System.out.print("Enter choice: ");
			choice = scan.nextInt();
			
			if(choice < 1 || choice > 5) {
				System.out.println("Invalid choice. Please choose 1-5");
			}
		}while(choice < 1 || choice > 5);
		
		// process the choice
		switch(choice) {
			case 1: 
				ATM.showTransactionHistory(theUser, scan);
				break;
			case 2:
				ATM.withdrawlFunds(theUser, scan);
			case 3:
				ATM.depositFunds(theUser, scan);
			case 4:
				ATM.transferFunds(theUser, scan);
				break;
		}
		
		// redisplay the menu unless the user wants to quit
		if(choice != 5) {
			ATM.printUserMenu(theUser, scan);
		}
	}
	
	public static void showTransHistory(User theUser, Scanner scan) {
		int theAcct;
		
		// get account whose transaction history to look at
		do {
			System.out.printf("Enter the number (1 - %d) of account" + " whose transactions you want to see: ", theUser.numAccounts());
			theAcct = scan.nextInt();
			if(theAcct < 0 || theAcct >= theUser.numAccounts()) {
				System.out.println("Invalid account. Please try again.");
			}
		}while(theAcct < 0 || theAcct >= theUser.numAccounts());
		
		theUser.printAcctTransHistory(theAcct);
	}
	
	/**
	 * Process transferring funds from one account to another
	 * @param theUser	the logged-in User object
	 * @param scan		the Scanner object used for the user input
	 */
	public static void transferFunds(User theUser, Scanner scan) {
		// inits
		int fromAcct;
		int toAcct;
		double amount;
		double acctBal;
		
		// get the account to transfer from 
		do {
			System.out.printf("Enter the number (1 - %d) of the account\n" + "to transfer from: ");
			fromAcct = scan.nextInt() - 1;
			if(fromAcct < 0 || fromAcct >= theUser.numAccounts()) {
				System.out.println("Invalid account. Please try again.");
			}
		}while(fromAcct < 0 || fromAcct >= theUser.numAccounts());
		acctBal = theUser.getAcctBalance(fromAcct);
		
		// get the account to transfer to 
		do {
			System.out.printf("Enter the number (1 - %d) of the account\n" + "to transfer to: ");
			toAcct = scan.nextInt() - 1;
			if(toAcct < 0 || toAcct >= theUser.numAccounts()) {
				System.out.println("Invalid account. Please try again.");
			}
		}while(toAcct < 0 || toAcct >= theUser.numAccounts());
		
		
		// get the amount to transfer
		do {
			System.out.printf("Enter the amount to transfer (max $%.02f): $", acctBal);
			amount = scan.nextDouble();
			if(amount < 0) {
				System.out.println("Amount must be greater than zero.");
			}else if(amount > acctBal) {
				System.out.printf("Amount must not be greater than\n" + 
							"balance of $%.02f.\n", acctBal);
			}
		}while(amount < 0 || amount > acctBal);
		
		// finally do the transfer
		theUser.addAcctTransaction(fromAcct, -1*amount, 
				String.format("Transfer to account %s", theUser.getAcctUUID(toAcct)));
		theUser.addAcctTransaction(toAcct, amount, 
				String.format("Transfer to account %s", theUser.getAcctUUID(fromAcct)));
	}
	
	/**
	 * 
	 * @param theUser
	 * @param scan
	 */
	public static void withdrawlFunds(User theUser, Scanner scan) {
		int fromAcct;
		double amount;
		double acctBal;
		String memo;
		
		// get the account to transfer from 
		do {
			System.out.printf("Enter the number (1 - %d) of the account\n" + "to transfer from: ");
			fromAcct = scan.nextInt() - 1;
			if(fromAcct < 0 || fromAcct >= theUser.numAccounts()) {
				System.out.println("Invalid account. Please try again.");
			}
		}while(fromAcct < 0 || fromAcct >= theUser.numAccounts());
		acctBal = theUser.getAcctBalance(fromAcct);
		
		// get the amount to transfer
		do {
			System.out.printf("Enter the amount to transfer (max $%.02f): $", acctBal);
			amount = scan.nextDouble();
			if(amount < 0) {
				System.out.println("Amount must be greater than zero.");
			}else if(amount > acctBal) {
				System.out.printf("Amount must not be greater than\n" + 
							"balance of $%.02f.\n", acctBal);
			}
		}while(amount < 0 || amount > acctBal);
		
		// gobble up rest of previous input
		scan.hasNextLine();
	}
}
