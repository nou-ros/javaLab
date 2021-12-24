import java.util.Scanner;


public class StrongNumber{
	public static void main(String[] args)
	{
		int range;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the value of range: ");
		range = scan.nextInt();
		for(int i=1;i<=range;i++)
			checkStrong(i);
	}

	static int fact(int number)
	{
		int factorial = 1;
		while(number != 0)
		{
			factorial=factorial*number;
			number--;
		}
		return factorial;
	}

	static void checkStrong(int number)
	{
		int sum = 0;
		int tempNumber = number;
		while(tempNumber!=0)
		{
			sum = sum + fact(tempNumber%10);
			tempNumber = tempNumber/10;
		}
		if(sum==number)
			System.out.println(number + " is a strong number");
	}
}
