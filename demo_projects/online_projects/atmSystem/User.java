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
		System.out.printf("New user %s, %s with ID %s created.\n", firstName, lastName, this.uuid);
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
}
