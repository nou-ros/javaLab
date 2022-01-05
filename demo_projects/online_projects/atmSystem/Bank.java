package atmSystem;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
	private String name;
	private ArrayList<User> users;
	private ArrayList<Account> accounts;
	
	/**
	 * Generate a new universally unique ID for a user
	 * @return
	 */
	public String getNewUserUUID() {
		String uuid;
		Random rng = new Random();
		int len = 6;
		boolean nonUnique;
		
		// continue looping until we get a unique ID
		do {
			//generate the number
			uuid = "";
			for(int c = 0; c < len; c++) {
				uuid += ((Integer)rng.nextInt(10)).toString();
			}
			nonUnique = false;
			//check to make sure it's unique
			for(User u: this.users) {
				if(uuid.compareTo(u.getUUID()) == 0) {
					nonUnique = true;
					break;
				}
			}
		}while(nonUnique);
		
		return uuid;
	}
	
	/**
	 * Generate a new universally unique ID for an account
	 * @return
	 */
	public String getNewAccountUUID() {
		String uuid;
		Random rng = new Random();
		int len = 10;
		boolean nonUnique;
		// continue looping until we get a unique ID
		do {
			//generate the number
			uuid = "";
			for(int c = 0; c < len; c++) {
				uuid += ((Integer)rng.nextInt(10)).toString();
			}
			nonUnique = false;
			//check to make sure it's unique
			for(Account acc: this.accounts) {
				if(uuid.compareTo(acc.getUUID()) == 0) {
					nonUnique = true;
					break;
				}
			}
		}while(nonUnique);
		return uuid;
	}
	
	/**
	 * Create a new user of the bank
	 * @param firstName the user's first name
	 * @param lastName 	the user's last name
	 * @param pin 		the user's pin
	 * @return 			the new User object
	 */
	public User addUser(String firstName, String lastName, String pin) {
		// create a new User object and add it to our list
		User newUser = new User(firstName, lastName, pin, this);
		this.users.add(newUser); 
		// create a savings account for the user and add to User and Bank 
		// accounts lists
		Account newAccount = new Account("Savings", newUser, this);
		newUser.addAccount(newAccount);
		this.accounts.add(newAccount);
		return newUser;
	}
	
	public User userLogin(String userID, String pin) {
		
	}
}
