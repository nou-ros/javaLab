package atmSystem;
import java.util.ArrayList;


public class Account {
	// name of the account
	private String name;
	// the account ID number
	private String uuid;
	// The user object that owns this account
	private User holder;
	// The list of transactions for this account 
	private ArrayList<Transaction> transactions;
	
	/**
	 * 
	 * @param name - account name
	 * @param holder - user object that holds this account 
	 * @param theBank - the bank that issues the account
	 */
	public Account(String name, User holder, Bank theBank) {
		// set account Name and holder
		this.name = name;
		this.holder = holder;
		// get new account UUID
		this.uuid = theBank.getNewAccountUUID();
		//initial transactions 
		this.transactions = new ArrayList<Transaction>();
	}
	
	/**
	 * Get Account's ID
	 * @return the uuid
	 */
	public String getUUID(){
		return this.uuid;
	}
	
	/**
	 * Get summary for an account 
	 * @return the string summary
	 */
	public String getSummaryLine() {
		// get the account's balance
		double balance = this.getBalance();
		
		// format the summary line, depending whether the balance is negative
		if(balance >= 0 ) {
			return String.format("%s : $%.02f : %s", this.uuid, balance, this.name);
		}else {
			return String.format("%s : $(%.02f) : %s", this.uuid, balance, this.name);
		}
	}
	
	/**
	 * Get the balance of this account by adding the amounts of teh transactions
	 * @return the balance value
	 */
	public double getBalance() {
		double balance = 0;
		for (Transaction t : this.transactions) {
			balance += t.getAmount();
		}
		return balance;
	}
	
	/**
	 * Print the transaction history of the account 
	 */
	public void printTransHistory() {
		System.out.printf("Transaction history for account %s\n", this.uuid);
		for(int t = this.transactions.size() - 1; t > 0; t--) {
			System.out.println(this.transactions.get(t).getSummaryLine());
		}
		System.out.println();
	}
	
	/**
	 * Add a new transaction in this account
	 * @param amount	the amount transacted
	 * @param memo		the transaction memo
	 */
	public void addTransaction(double amount, String memo) {
		// Create new transaction object and add it to our list
		Transaction newTrans = new Transaction(amount, memo, this);
		this.transactions.add(newTrans);
	}
}
