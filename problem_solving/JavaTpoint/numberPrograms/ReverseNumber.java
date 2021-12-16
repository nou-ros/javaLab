import java.util.Scanner;

class ReverseNumber{
	private int reverse_number(int number)
	{
		System.out.println("Reverse of the number: " + number);
		int remainder, reverse=0;
		while(number!=0)
		{
			remainder=number%10;
			number= number/10;
			reverse = reverse*10 + remainder;
		}
		return reverse;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		ReverseNumber rev_num = new ReverseNumber();
		System.out.println(rev_num.reverse_number(numb));
	}
}
