import java.util.Scanner;

public class GCD{
	public static void main(String args[])
	{

		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter two numbers: ");	
		int x = scan.nextInt(), y = scan.nextInt();
		findGCD1(x, y);
		findGCD2(x, y);
		findGCD3(x, y);
	}

	static void findGCD1(int x, int y)
	{
		int gcd = 0;
		for(int i = 1; i <= x && i <= y; i++)
		{
			if(x % i == 0 && y % i == 0)
				gcd = i;
		}

		System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
	}

	static void findGCD2(int x, int y)
	{
		while(x != y)
		{
			if(x > y)
				x = x - y;
			else
				y = y - x;
		}
		System.out.println("\nGCD is: " + y);
	}

	static void findGCD3(int x, int y)
	{
		int temp, gcd = 0;
		while(y != 0)
		{
			temp = y;
			y = x % y;
			x = temp;
		}
		gcd = x;
		System.out.println("GCD is: " + gcd);
	}


}
