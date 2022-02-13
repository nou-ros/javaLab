//For a given array of integers (positive and negative) find the largest sum of a contiguous sequence

class MaxSubArraySum{
	public static void main(String args[]){
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("Maximum contiguous sum is : " + maxSubArraySum(arr));
	}
	static int maxSubArraySum(int arr[]){
		int size = arr.length;
		int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

		for(int i = 0; i < size; i++)
		{
			maxEndingHere = maxEndingHere + arr[i];
			if(maxSoFar < maxEndingHere)
				maxSoFar = maxEndingHere;
			if(maxEndingHere < 0)
				maxEndingHere = 0;
		}
		return maxSoFar;
	}
}
