import java.util.Scanner;

public class NaturalSum{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		System.out.println("Sum of numbers: " + sumOfNatural(num));
	}

	static int sumOfNatural(int n)
	{
		return n * (n + 1) / 2;
	}
}
