import java.util.Scanner;

public class EvenOddList{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start number: ");
		int start = scan.nextInt();
		System.out.println("Enter end number: ");
		int end = scan.nextInt();
		evenoddList(start, end);
	}

	static void evenoddList(int start, int end)
	{
		for(int i = start; i <= end; i++)
		{
			if(i % 2 == 0)
				System.out.println("even: " + i);
			else
				System.out.println("Odd: " + i);
		}
	}
}
