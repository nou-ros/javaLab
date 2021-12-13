class MaxMinArry{
	public static void main(String[] args)
	{
		int arr[] = new int[]{25,11,7,75,56};
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Max of the array: "+max);
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Min of the array: "+min);
	}
}
