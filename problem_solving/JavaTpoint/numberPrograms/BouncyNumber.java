import java.util.Scanner;

public class BouncyNumber{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number you want to check: ");

		int input = scan.nextInt();
		if(isIncreasing(input)||isDecreasing(input)||input<101)
		{
			System.out.println(input + " not a bouncy number.");
		}
		else
		{
			System.out.println(input + " is a bouncy number.");
		}
	}
	
	public static boolean isIncreasing(int input)
	{
		String str = Integer.toString(input);
		char digit;
		boolean flag = true;
		for(int i=0;i<str.length()-1;i++)
		{
			digit = str.charAt(i);
			if(digit>str.charAt(i+1))
			{
				flag=false;
				break;
			}
		}
		return flag;
	}

	public static boolean isDecreasing(int input)
	{
		String str = Integer.toString(input);
		char digit;
		boolean flag = true;
		for(int i=0;i<str.length()-1;i++)
		{
			digit = str.charAt(i);
			if(digit<str.charAt(i+1))
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}
