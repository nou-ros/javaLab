import java.util.*;


class KeithNumber{
	private static boolean isKeith(int num)
	{
		ArrayList<Integer> terms = new ArrayList<Integer>();
		int temp=num,digits=0;
		while(temp>0)
		{
			terms.add(temp%10);
			temp=temp/10;
			digits++;
		}

		Collections.reverse(terms);
		int next_term=0,i=digits;

		while(next_term<num)
		{
			next_term=0;
			for(int j=1;j<=digits;j++)
			{
				System.out.println("getting: "+terms.get(i-j));
				next_term = next_term + terms.get(i-j);
			}
			terms.add(next_term);
			i++;
		}

		for(Integer integer:terms)
		{
			System.out.println(integer);
		}
		return (next_term==num);
	}

	public static void main(String[] args)
	{
		if(isKeith(742))
		{
			System.out.println("Keith number");
		}
		else
		{
			System.out.println("Not keith!");
		}
	}
}
