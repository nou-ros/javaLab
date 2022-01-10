import java.util.Scanner;


class FascinatingNumber{

	private static boolean digitPresent(String value)
	{
		boolean found=true;
		for(char c='1';c<='9';c++)
		{
			int count=0;
			for(int i=0;i<value.length();i++)
			{
				char ch = value.charAt(i);
				if(ch==c)
				{
					count++;
				}
			}
			if(count>1 || count==0)
			{
				found=false;
				break;
			}
		}
		return found;
	}

	private static boolean isFascinating(int num)
	{
		int multiply_2 = num*2;
		int multiply_3 = num*3;
		String concatNumb = num+""+multiply_2+multiply_3;
		//System.out.println(concatNumb.getClass().getName());
		if(digitPresent(concatNumb))
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		isFascinating(112);
		Scanner scan = new Scanner(System.in);
		int start,end;
		System.out.println("Enter start number: ");
		start = scan.nextInt();
		System.out.println("Enter end number: ");
		end = scan.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(isFascinating(i))
				System.out.println(i);
		}

	}
}

