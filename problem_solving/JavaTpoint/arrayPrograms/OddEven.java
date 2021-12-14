class OddEven{
	
	private void printOddEven(int[] a){
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print("Odd: "+a[i]);
			}
			else
			{
				System.out.print("Even: "+a[i]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		OddEven numb = new OddEven();
		int[] arr = {1,2,5,3,6,2};
		numb.printOddEven(arr);
	}
}
