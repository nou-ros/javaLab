import java.util.Scanner;

public class Sqrcheck{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = scan.nextDouble();
		if(perfectSqr(num) && perfectSqr2(num))
		{
			System.out.println("Perfect square");
		}
		else
		{
			System.out.println("Not perfect square");
		}
	}	

	static boolean perfectSqr(double num)
	{
		double sqrt = Math.sqrt(num);
		return ((sqrt - Math.floor(sqrt)) == 0);
	}

	static boolean perfectSqr2(double num)
	{
		for(int i = 1; i * i <= num; i ++)
		{
			if((num % i == 0) && (num/i == i))
			{
				return true;
			}
		}
		return false;
	}
}	
