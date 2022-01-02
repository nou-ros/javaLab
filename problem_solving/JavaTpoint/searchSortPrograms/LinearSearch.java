import java.util.Scanner;

public class LinearSearch{
	public static void main(String args[])
	{
		int a[] = { 10, 20, 30, 50, 70, 90 };
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a search value: ");
		int key = scan.nextInt();
		System.out.println(key + " is found at index: " + linearSearch(a, key));
	}

	public static int linearSearch(int arr[], int key)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == key)
			{
				return i;
			}
		}
		return -1;
	}
}
