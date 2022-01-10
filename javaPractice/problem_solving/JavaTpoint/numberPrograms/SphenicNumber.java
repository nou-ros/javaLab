import java.util.Scanner;

class SphenicNumber{

	public static void sphenicNumber()
	{
		Scanner scan = new Scanner(System.in);
		int lower, upper,i,n,f,count,k;

		System.out.println("Enter the lower limit: ");
		lower = scan.nextInt();
		System.out.println("Enter the upper limit: ");
		upper = scan.nextInt();
		System.out.println("Sphenic numbers between the given range are: ");
		for(i=lower;i<=upper;i++)
		{
			n=i;
			k=0;

			int primeFactors [] = {0,0,0};
			for(f=2;n!=1;f++)
			{
				count = 0;
				while(n%f==0)
				{
					count++;
					n=n/f;
				}
				if(count == 1)
					primeFactors[k++]=f;
				if(k==primeFactors.length)
					break;
			}
			n=primeFactors[0]*primeFactors[1]*primeFactors[2];
			if(i==n)
				System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		sphenicNumber();
	}
}
