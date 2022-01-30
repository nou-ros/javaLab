import java.util.Scanner;

public class MysteryNumber{
	static int reverse(int x)
	{
		String str = Integer.toString(x);
		String string = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			string = string + str.charAt(i);
		}
		int rev = Integer.parseInt(str);
		return rev;
	}

	static boolean isMystery(int num)
	{
		for(int i=1;i<=num/2;i++)
		{
			int j = reverse(i);
			if(i+j == num)
			{
				System.out.println(i + " " +j);
				System.out.println(num + " is a mystery number.");
				return true;
			}
		}
		System.out.println("The given numbers is not a mystery number.");
		return false;
	}

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		isMystery(num);
		scan.close();
	}
}
