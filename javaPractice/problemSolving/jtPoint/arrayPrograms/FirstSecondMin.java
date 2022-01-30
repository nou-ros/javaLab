import java.util.*;

class FirstSecondMin{
	
	private static int arraySortSmallest(int a[])
	{
		Arrays.sort(a);
		return a[1];
	}

	private int arraySortForSmallest(int a[]){
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for(int i = 0;i < a.length; i++)
		{
			if(smallest > a[i])
			{
				secondSmallest = smallest;
				smallest = a[i];
			}
			else if(secondSmallest > a[i] && secondSmallest != smallest)
			{
				secondSmallest = a[i];
			}
		}

		return secondSmallest;
	}

	public static void main(String[] args){
		int a[] = {1, 2, 5, 6, 3, 2};
		//System.out.println(arraySortSmallest(a));
		FirstSecondMin num = new FirstSecondMin();
		System.out.println(num.arraySortForSmallest(a));
	}
}
