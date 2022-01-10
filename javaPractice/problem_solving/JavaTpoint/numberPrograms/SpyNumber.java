import java.util.Scanner;

class SpyNumber{
	private boolean isSpy(int num)
	{
		int remain, prod=1, sum=0;
		while(num!=0)
		{
			remain = num%10;
			sum += remain;
			prod *= remain;
			num /= 10;
		}
		if(sum==prod)
		{
			return true;
		}
		return false;
	}

	private void spyRange()
	{	
		System.out.println("Enter start and end value: ");
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();

		for(int i=start;i<=end;i++)
		{
			if(isSpy(i))
				System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		SpyNumber numb = new SpyNumber();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		if (numb.isSpy(num))
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not spy");
		}
		numb.spyRange();
	}
}
