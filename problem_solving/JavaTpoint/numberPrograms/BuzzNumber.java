import java.util.Scanner;

class BuzzNumber{
	private boolean isBuzz(int num)
	{
		if(num%7==0)
			return true;
		else if(num%10==7)
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		BuzzNumber bn = new BuzzNumber();
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter start number: ");
		int start = scan.nextInt();
		System.out.println("Enter end number: ");
		int end = scan.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(bn.isBuzz(i))
			{
				System.out.print(i + " ");
			}
		}
	}
}
