import java.util.Arrays;

class FirstSecondThirdLargest{
	private static int arraySortLargest(int a[])
	{
		Arrays.sort(a);
		int first = a[a.length-1];
		int second = a[a.length-2];
		int third = a[a.length-3];
		return second;
	}
	private int arrayForLargest(int a[]){
		int max = 0;
		int secondMax = 0;
		int thirdMax = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(max < a[i])
			{
				thirdMax = secondMax;
				secondMax = max;
				max = a[i];
			}
			else if(secondMax < a[i] && secondMax != max)
			{
				secondMax = a[i];
			}
			else if(thirdMax < a[i] && thirdMax! = secondMax)
			{
				thirdMax = a[i];
			}
		}

		return thirdMax;
	}
	public static void main(String[] args){
		int arr[] = new int[] {4, 6, 9, 7, 3, 2, 5};
		System.out.println("Largest using array sort: " + arraySortLargest(arr));
		FirstSecondThirdLargest value = new FirstSecondThirdLargest();
		System.out.println("Largest using array for: " + value.arrayForLargest(arr));
	}
}
