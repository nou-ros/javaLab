import java.util.Scanner;

public class PosNegNumber{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		PosNegNumber.checkPosNeg(num);
		PosNegNumber.checkPosNeg2(num);
	}

	static void checkPosNeg(int num)
	{
		if(num > 0)
			System.out.println("Positive");
		else if(num < 0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}
	
	static void checkPosNeg2(int num)
	{
		double number = num;
		double result = Math.signum(number); 
		System.out.println(result);
	}
}
