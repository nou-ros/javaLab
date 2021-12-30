import java.util.Scanner;

public class SwapNumber{
	public static void main(String args[])
	{
		int a, b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = scan.nextInt();
		System.out.println("Enter second number: ");
		b = scan.nextInt();

		System.out.println("Before swapping: ");
		System.out.println("a = " + a + ", b = " + b);
	        a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swaping: ");
		System.out.print("a = " + a + ", b = " + b);	
	}
}	
