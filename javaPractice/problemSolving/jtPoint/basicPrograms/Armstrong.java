import java.util.Scanner;
import java.lang.Math;

class Armstrong{
	private int num = 0;

	public Armstrong(){
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter a number: ");
		this.num = scan.nextInt();
	}

	private int check_armstrong(){
		int rem=0,digit=0,numb=this.num,sum=0;

		while(numb>0)
		{
			numb = numb/10;
			digit++;
		}
		numb = this.num;
		while(numb>0){
			rem = numb%10;
			numb = numb/10;
			sum += (Math.pow(rem,digit));
		}
		return sum;
	}	

	private void return_answer(){
		if (this.num==check_armstrong())
		{
			System.out.println("Armstrong");	
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
	
	public static void main(String[] args){
		Armstrong value = new Armstrong();
		value.return_answer();
	}
}
