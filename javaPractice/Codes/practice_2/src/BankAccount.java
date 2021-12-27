enum AccountType {
	SAVINGS, CURRENT
}

public class BankAccount {
	private AccountType accountType;
	private String accountName;
	private int accountNumber;
	private double currentBalance;
	private String branchName;

	BankAccount(AccountType accountType, String accountName, int accountNumber, double currentBalance, String branchName)
	{
		this.accountType = accountType;
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
		this.branchName = branchName;
	}
	
	public void setAccountType(AccountType accountType)
	{
		this.accountType = accountType;
	}
	
	public void setAccountName(String accountName)
	{
		this.accountName = accountName;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public void setCurrentBalance(double currentBalance)
	{
		this.currentBalance = currentBalance;
	}
	
	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}
	
	public AccountType getAccountType()
	{
		return this.accountType;
	}
	
	public String getAccountName()
	{
		return this.accountName;
	}
	
	public int getAccountNumber()
	{
		return this.accountNumber;
	}
	
	public double getCurrentBalance()
	{
		return this.currentBalance;
	}
	
	public String getBranchName()
	{
		return this.branchName;
	}
	
	public void addMoney(double money)
	{
		this.currentBalance += money;
	}
	
	public void withDrawMoney(double money)
	{
		this.currentBalance -= money;
	}
}
