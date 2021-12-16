import java.util.Scanner;


class PetersonNumber{

	private static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	private static boolean isPeterson(int num)
	{
		int rem, sum=0, temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			sum+=factorial(rem);
			temp/=10;
		}	
		return num==sum;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(isPeterson(num));
	}
}
