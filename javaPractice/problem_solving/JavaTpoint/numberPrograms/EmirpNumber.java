import java.util.Scanner;

class EmirpNumber{

	public boolean checkPrime(int num)
	{	
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public String isEmirp(int num, int rev)
	{
		if (checkPrime(num))
		{
			if(checkPrime(rev))
			{
				return "Emirp";
			}
		}
		return "Not Emirp";

	}

	public void emirpNumber(int num)
	{
		int rem,rev=0;
		int numb = num;
		while(numb!=0)
		{
			rem = numb%10;
			rev = rev*10+rem;
			numb = numb/10;
		}
		String output =	isEmirp(num, rev);
		System.out.println(output);
	}

	public static void main(String[] args)
	{
		EmirpNumber value = new EmirpNumber();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		value.emirpNumber(number);
	}
}	
