import java.util.Scanner;

class NeonNumber{
	private static boolean isNeon(int num)
	{
		int square=num*num;
		int remainder,sum=0;
		while(square!=0)
		{
			remainder=square%10;
			sum+=remainder;
			square/=10;
		}
		return (sum==num);
	}

	private static void neonList()
	{
		int start,end;
		System.out.println("Enter start number: ");
		Scanner input = new Scanner(System.in);
		start = input.nextInt();
		System.out.println("Enter end number: ");
		end = input.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(isNeon(i))
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String res = isNeon(num) ? "Neon" : "Not Neon";
		System.out.println(res);

		neonList();
	}
}
