import java.util.Scanner;

public class Strontio{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a four-digit number: ");
		int num = scan.nextInt();
		if((num>999)&&(num<10000))
		{
			int n = num;
			num = num*2;
			num = num/10;
			num = num%100;
			//comparing the remainder and quotient
			if(num%10 == num/10)
			{
				System.out.println(n + " is a strontio number.");
			}
			else
				System.out.println(n + " is not a strontio number.");
		}
		scan.close();
	}
}
