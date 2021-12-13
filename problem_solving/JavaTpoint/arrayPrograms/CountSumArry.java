class CountSumArray{
	public static void main(String[] args)
	{
		
		int arr[] = new int[]{3,5,7,9,11};
		int count,sum;
		count = 0;
		sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			count+=1;
			sum+=arr[i];
		}
		System.out.println("Count is: "+count+"\n"+"Sum is: "+sum);
	}
}
