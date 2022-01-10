class EvenOddPosition{
	public static void main(String args[]){
		int arr[] = new int[] {1, 2, 3, 4, 5, 6};
		System.out.println("Odd Print: ");
		for(int i = 0; i < arr.length; i = i + 2)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Even Print: ");
		for(int j = 1; j < arr.length; j = j + 2)
		{
			System.out.print(arr[j]);
		}
		System.out.println();
	}
}
