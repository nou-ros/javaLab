import java.util.Scanner;

public class SqrtNumber{
	public static void main(String args[])
	{
		System.out.print("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("The square root of " + n + " is: " + squareRoot(n));
	}

	public static double squareRoot(int num)
	{
		double t;
		double sqrRoot = num / 2;
		do{
			t = sqrRoot;
			sqrRoot = (t + (num / t)) / 2;
		}while((t - sqrRoot) != 0);

		return sqrRoot;
	}
}
