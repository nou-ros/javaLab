package atmSystem;
import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
	// first name of the user
	private String firstName;
	// last name of the user
	private String lastName;
	// ID number of the user
	private String uuid;
	// MD5 hash of the user's pin 
	private byte pinHash[];
	// list of accounts for this user
	private ArrayList<Account> accounts;
	
	/**
	 * 
	 * @param firstName - first name of the user
	 * @param lastName - last name of the user
	 * @param pin - pin number of the user
	 * @param theBank - The bank object that the user is a customer of
	 */
	public User(String firstName, String lastName, String pin, Bank theBank) {
		this.firstName = firstName;
		this.lastName = lastName;
		//store pin in MD5 hash for security
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			this.pinHash = md.digest(pin.getBytes());
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Error caught NoSuchAlgorithmException");
			e.printStackTrace();
			System.exit(1);
		}
		// get a new, unique universal ID for the user
		this.uuid = theBank.getNewUserUUID();
		
		// create empty list of accounts
		this.accounts = new ArrayList<Account>();
		
		// print log message
		System.out.printf("New user %s, %s with ID %s created.\n", this.firstName, this.lastName, this.uuid);
	}
	
	/**
	 * Add an account for the user
	 * @param anAccnt  the account to add
	 */
	public void addAccount(Account anAccnt) {
		this.accounts.add(anAccnt);
	}
	
	// get users's ID
	public String getUUID(){
		return this.uuid;
	}
	/**
	 * Check whether a given pin matches the true User pin
	 * @param pin the pin to check
	 * @return whether the pin is valid or not
	 */
	
	public boolean validatePin(String pin){
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			return MessageDigest.isEqual(md.digest(pin.getBytes()), 
					this.pinHash);
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Error caught NoSuchAlgorithmException");
			e.printStackTrace();
			System.exit(1);
		}
		return false;
	}
	
	/**
	 * Return user's first name
	 * @return the first name
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * Print summaries for the accounts of this user
	 */
	public void printAccountsSummary() {
		System.out.printf("\n\n%s's accounts summary:\n", (this.firstName + " " + this.lastName));
		for(int a = 0; a < this.accounts.size(); a++) {
			System.out.printf("  %d) %s\n", a+1, this.accounts.get(a).getSummaryLine());
		}
		System.out.println();
	}
	
	/**
	 * Get the number of accounts of the user
	 * @return the number of accounts
	 */
	public int numAccounts() {
		return this.accounts.size();
	}
	
	/**
	 * Print transaction history for a particular account
	 * @param acctIdx the index of the account to use
	 */
	public void printAcctTransHistory(int acctIdx) {
		this.accounts.get(acctIdx).printTransHistory();
	}
	
	/**
	 * Get the balance of a particular account
	 * @param acctIdx the index of the account to use
	 * @return 	the balance of the account
	 */
	public double getAcctBalance(int acctIdx) {
		return this.accounts.get(acctIdx).getBalance();
	}
	
	/**
	 * Get the UUID of a particular account
	 * @param acctIdx 	the index of the account to use
	 * @return			the UUID of the account
	 */
	public String getAcctUUID(int acctIdx) {
		return this.accounts.get(acctIdx).getUUID();
	}
	
	/**
	 * Add a transaction to a particular account
	 * @param acctIdx 	the index of the account
	 * @param amount	the amount of the transaction
	 * @param memo		the memo of the transaction
	 */
	public void addAcctTransaction(int acctIdx, double amount, String memo) {
		this.accounts.get(acctIdx).addTransaction(amount, memo);
	}
}






