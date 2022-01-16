package atmSystem;

import java.util.Date;

public class Transaction {
	
	// amount of the transaction
	private double amount;
	// time and date of this transaction
	private Date timestamp;
	// memo for this transaction
	private String memo;
	// the account in which the transaction was performed
	private Account inAccount;
	
	/**
	 * Create a new transaction
	 * @param amount - the transacted amount
	 * @param inAccount - the account the transaction belongs to
	 */
	public Transaction(double amount, Account inAccount) {
		this.amount = amount;
		this.inAccount = inAccount;
		this.timestamp = new Date();
		this.memo = "";
	}
	
	/**
	 * 
	 * @param amount - the amount transacted
	 * @param memo - the memo for the transaction
	 * @param inAccount - the account the transaction belongs to
	 */
	public Transaction(double amount, String memo, Account inAccount) {
		// call the two-arg constructor first
		this(amount, inAccount);
		
		//set the memo
		this.memo = memo;
	}
	
	/**
	 * Get the amount of the transaction
	 * @return the amount
	 */
	public double getAmount() {
		return this.amount;
	}
	
	/**
	 * Get a string summarizing the transaction
	 * @return the summary string
	 */
	public String getSummaryLine() {
		if(this.amount >= 0) {
			return String.format("%s : $%.02f : %s. Remaining balance in -> %s", 
					this.timestamp.toString(), this.amount, this.memo, this.inAccount.getSummaryLine());
		}else {
			return String.format("%s : $(%.02f) : %s. Remaining balance in -> %s", 
					this.timestamp.toString(), -this.amount, this.memo, this.inAccount.getSummaryLine());
		}
	}
	
}
