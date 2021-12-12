import java.util.Scanner;

class LeftRotateArray{
	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,4,5};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value for left rotation: ");
		int n = scan.nextInt();

		System.out.println("Original array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		for(int i=0;i<n;i++)
		{
			int j,first;
			first = arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println();
		System.out.println("After left rotation: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
