import java.util.Scanner;


class AutobiographicalNumber{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to check: ");
		int num = scan.nextInt();
		num = Math.abs(num);
		int n = num;
		String str = String.valueOf(num);
		int digitArray[] = new int[str.length()];
		for(int i=digitArray.length-1;i>=0;i--)
		{
			digitArray[i] = n%10;
			n = n/10;
		}
		boolean flag = true;
		for(int i=0;i<digitArray.length;i++)
		{
			int count = 0;
			for(int j=0;j<digitArray.length;j++)
			{
				if(i==digitArray[j])
				{
					count++;
				}
			}
			
			if(count != digitArray[i])
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(num + " is an autobiographical number");
		else
			System.out.println(num + " is not an autobiographical number");
	}
}
