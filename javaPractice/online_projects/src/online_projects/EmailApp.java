/*Email Application
 * Application should have the following:
 * Generate an email with the following syntax: firstname.lastname@
 * department.company.com
 * Determine the department(sales, development, accounting), if none leave blank.
 * Generate a random String for a password
 * Have set methods to change the password, set the mailbox capacity, and define an 
 * alternate email address
 * Have get methods to display the name, email and mailbox capacity.
 */

package online_projects;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email emp = new Email("John", "Smith");
		System.out.print(emp.showInfo());
//		emp.setAlternateEmail("emp@testmail.com");
//		System.out.println(emp.getAlternateEmail());
	}

}
