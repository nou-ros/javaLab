import java.lang.*;

public class Practice{
	public static void main(String [] args)
	{
		int A[] = {3,9,7,8,12,6,15,5,4,10};
		
		int max2, max1;
		max1 = max2 = A[0];
		for(int x:A)
		{
			if(max1<x)
			{
				max2=max1;
				max1=x;
			}
			else if(max2<x)
				max2=x;
		}

		System.out.println(max1 + " and " + max2);

	}
}