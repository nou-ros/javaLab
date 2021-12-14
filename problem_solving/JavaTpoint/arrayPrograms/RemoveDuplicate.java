import java.util.Arrays;

class RemoveDuplicate{
	
	public static int[] removeDuplicate(int[] a)
	{
		int[] temp = new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
		temp[j++] = a[a.length-1];
		return temp;
	}

	public static void main(String[] args)
	{
		int arr[] = {1,7,9,2,2,3,2,4,7,5};
		Arrays.sort(arr);
		int[] arr2 = removeDuplicate(arr);
		for(int k=0;k<arr2.length;k++)
		{
			if(arr2[k]!=0)
			{
				System.out.print(arr2[k]+" ");
			}
		}

	}
}
