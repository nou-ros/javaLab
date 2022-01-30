
import java.util.Scanner;


public class DuckNumber{
	public static boolean isDuck(int number)
	{
		while(number!=0)
		{
			if(number%10==0)
				return true;
			number = number/10;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int range;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range value: ");
		range = scan.nextInt();
		for(int i=1;i<=range;i++)
		{
			if(isDuck(i))
			{
				System.out.println(i);
			}
		}
	}
}
