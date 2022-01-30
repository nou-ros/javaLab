import java.util.Scanner;

public class EvilNumber{
	public static void main(String[] args)
	{
		int range;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range: ");
		range = scan.nextInt();
		for(int i=1;i<=range;i++)
		{
			if(isEvil(i))
			{
				System.out.println(i);
			}
		}
	}

	public static boolean isEvil(int n)
	{
		long binNum = converToBinary(n);
		int count = 0;
		while(binNum != 0)
		{
			if(binNum%10==1)
				count++;
			binNum = binNum/10;
		}
		if(count%2==0)
			return true;
		return false;
	}

	private static long converToBinary(int num)
	{
		long binNum = 0;
		int rem = 0;
		int j = 1;
		while(num!=0)
		{
			rem = num%2;
			binNum += rem*j;
			num = num/2;
			j = j*10;
		}
		return binNum;
	}
}
