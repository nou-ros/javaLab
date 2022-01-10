import java.util.Scanner;

class PrimeNumber{
	private boolean isPrime(int n){
		if(n<=1)
		{
			return false;	
		}
		for(int i=2;i<n;i++){
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	static void primeSeries(int start, int end){
		PrimeNumber pn = new PrimeNumber();
		for(int i=start;i<=end;i++)
		{
			if(pn.isPrime(i)){
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("1. Check prime \n2. Prime series ");	
		System.out.println("Enter a choice: ");
		int choice = s.nextInt();

		switch(choice)
		{
			case 1:
				System.out.println("Enter a number: ");
				int n = s.nextInt();
				PrimeNumber numb = new PrimeNumber();
				if(numb.isPrime(n)){
					System.out.println(n + " is a prime number.");
				}
				else{
					System.out.println(n + " is not a prime number.");
				}
				break;
			case 2:
				System.out.println("Enter the start number: ");
				int start = s.nextInt();
				System.out.println("Enter the end number: ");
				int end = s.nextInt();
				primeSeries(start, end);
				break;
			default:
				System.out.println("Default case");
		}
	}
}

