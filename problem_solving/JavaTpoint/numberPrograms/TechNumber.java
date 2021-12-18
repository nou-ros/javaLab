import java.util.Scanner;

class TechNumber{

	private static int find_digits(int value)
	{
		int num,digits=0;	
		num=value;
		while(num>0)
		{
			digits++;
			num=num/10;
		}
		return digits;
	}

	public static boolean isTechNumber(int numb)
	{
		int num=numb,digits,first_half,second_half,sum_square=0;
		digits = find_digits(numb);		
		if(digits%2==0)
		{
			first_half=num%(int)Math.pow(10,digits/2);
			second_half=num/(int)Math.pow(10,digits/2);
			sum_square=(first_half+second_half)*(first_half+second_half);
			if(numb==sum_square)
			{
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
	public static void main(String[] args)
	{
		//System.out.println(isTechNumber(2025));
		int start,end;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start number: ");
		start = scan.nextInt();
		System.out.println("Enter end number: ");
		end = scan.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(isTechNumber(i))
				System.out.println(i);
		}
	}
}
