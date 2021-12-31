import java.util.Scanner;

public class FindSmallest{
	public static void main(String args[])
	{
		int a, b, c, min;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = scan.nextInt();
		System.out.println("Enter the second number: ");
		b = scan.nextInt();
		System.out.println("Enter the third number: ");
		c = scan.nextInt();
		min = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
		System.out.println("The smallest number is: " + min);
	}
}
