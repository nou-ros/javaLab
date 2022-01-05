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
	
	// Get Account's ID
	public String getUUID(){
		return this.uuid;
	}
}
