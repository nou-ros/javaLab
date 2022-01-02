import java.util.Arrays;

public class BinarySearch{
	public static void binarySearch(int arr[], int first, int last, int key)
	{
		int mid = (first + last) / 2;
		while(first <= last)
		{
			if(arr[mid] < key)
			{
				first = mid + 1;
			}
			else if(arr[mid] == key)
			{
				System.out.println("Element is found at index: " + mid);
				break;
			}
			else
			{
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if(first > last)
		{
			System.out.println("Element not found");
		}
	}

	public static int binaryRecur(int arr[], int first, int last, int key)
	{
		if(last >= first)
		{
			int mid = (first + last) / 2;
			if(arr[mid] == key)
				return mid;
			if(arr[mid] > key)
				return binaryRecur(arr, first, mid - 1, key);
			else
				return binaryRecur(arr, mid + 1, last, key);
		}
		return -1;
	}

	public static void javaArrayBinary(int arr[], int key)
	{
		int result = Arrays.binarySearch(arr, key);
		if(result < 0)
			System.out.println("Element not found");
		else
			System.out.println("Found at: " + result);
	}

	public static void main(String args[])
	{
		int arr[] = {10, 20, 30, 40, 50};
		int key = 30;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);
		System.out.println(binaryRecur(arr, 0, last, key));
		javaArrayBinary(arr, key);
	}
}
