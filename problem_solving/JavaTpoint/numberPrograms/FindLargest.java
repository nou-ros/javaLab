import java.util.Scanner;

public class FindLargest{
	public static void main(String args[])
	{
		int a, b, c, max;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = scan.nextInt();
		System.out.println("Enter the second number: ");
		b = scan.nextInt();
		System.out.println("Enter the third number: ");
		c = scan.nextInt();
		max = c > ((a > b) ? a : b)  ? c : (a > b ? a : b);
		System.out.println("largest number is: " + max);
	}
}
