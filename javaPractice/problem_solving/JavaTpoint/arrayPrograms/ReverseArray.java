class ReverseArray{
	public static void main(String args[]){
		int arr[] = new int[] {1, 2, 3, 4, 5};
		int i = arr.length - 1;
		for(; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
