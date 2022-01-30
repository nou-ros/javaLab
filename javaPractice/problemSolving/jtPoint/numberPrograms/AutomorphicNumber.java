import java.util.Scanner;

class AutomorphicNumber{
	private static boolean isAutomorphic(int num)
	{
		int square = num*num;
		while(num>0)
		{
			if(num%10 != square%10)
			{
				return false;
			}
			square = square/10;
			num = num/10;
			
		}
		return true;
	}

	private boolean isAutomorphic_second(int num)
	{
		int temp = num;
		int count = 0;
		int square = num*num;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		int last_digit = (int)(square%(Math.pow(10,count)));
		return num==last_digit;
	}

	private void automorphic_list()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		int start = scan.nextInt();

		System.out.println("Enter the end value: ");
		int end = scan.nextInt();
		System.out.println("Automorphic numbers between "+start+" and "+end+" are: ");
		for(int i=start;i<=end;i++)
		{
			if(isAutomorphic_second(i))
			{
				System.out.println(i+" ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		//System.out.println(isAutomorphic(76)?"Automorphic":"Not Automorphic");
		//System.out.println(isAutomorphic(13)?"Automorphic":"Not Automorphic");
		
		AutomorphicNumber num = new AutomorphicNumber();
		num.automorphic_list();
	}
}
