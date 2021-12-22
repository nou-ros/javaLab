class Account
{
	int accountNo;
	String name;
	float amount;

	void insert(int accountNo, String name, float amount)
	{
		this.accountNo = accountNo;
		this.name = name;
		this.amount = amount;
	}

	void deposit(float amount)
	{
		this.amount = this.amount + amount;
		System.out.println(amount + " deposited.");
	}

	void withdraw(float amount)
	{
		if(this.amount < amount)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			this.amount = this.amount - amount;
			System.out.println(amount + " withdrawn");
		}
	}

	void checkBalance()
	{
		System.out.println("Current Balance is: " + this.amount);
	}

	void display()
	{
		System.out.println(this.accountNo + " " + this.name + " " + this.amount);
	}
}

public class TestAccount{
	public static void main(String[] args)
	{
		Account account = new Account();

		account.insert(832345, "User", 1000);
		account.display();
		account.checkBalance();
		account.deposit(40000);
		account.checkBalance();
		account.withdraw(15000);
		account.checkBalance();
	}
}
