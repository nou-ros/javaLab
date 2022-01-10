import java.util.Scanner;

class SunnyNumber{

	private static boolean perfectSquare(double num)
	{
		double square_root = Math.sqrt(num);

		return ((square_root-Math.floor(square_root))==0);
	}
	
	private static boolean isSunny(int num)
	{
		return perfectSquare(num+1);
	}	
	
	private void sunnyNumberRange()
	{
		System.out.println("Enter upper bound");
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		System.out.println("Enter lower bound");
		int end = scan.nextInt();

		for(int i=start;i<=end;i++)
		{
			if(isSunny(i))
			{
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();

		if(isSunny(value))
		{
			System.out.println("Sunny number");
		}
		else
		{
			System.out.println("Not Sunny number");
		}
		
		SunnyNumber numb = new SunnyNumber();
		numb.sunnyNumberRange();
	}
}
