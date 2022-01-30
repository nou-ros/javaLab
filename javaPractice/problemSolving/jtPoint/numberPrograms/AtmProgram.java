import java.util.Scanner;


class AtmProgram{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int balance = 10000, withdraw, deposit;

		while(true)
		{
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.println("Choose the operation you want to perform: ");

			int choice = scan.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Enter withdrawal amount: ");
					withdraw = scan.nextInt();
					if(balance >= withdraw)
					{
						balance = balance - withdraw;
						System.out.println("Please collect your money");
					}
					else
					{
						System.out.println("Insufficient Balance");
					}
					System.out.println("");
					break;
				case 2:
					System.out.println("Enter money to be deposited");
					deposit = scan.nextInt();
					balance = balance + deposit;
					System.out.println("Your money has been successfull");
					System.out.println("");
					break;
				case 3:
					System.out.println("Balance: "+balance);
					System.out.println("");
					break;
				case 4:
					System.exit(0);
			}
		}
	}		
}
