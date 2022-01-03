public class SelectionSort{
	public static void selectionSort(int arr[]){
		for(int i = 0; i < arr.length - 1; i++){
			int index = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[index]){
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

	public static void main(String args[]){
		int arr[] = {9, 4, 3, 2, 43, 11, 34, 57, 22};
		System.out.println("Array elements: ");
		for(int i:arr){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Array elements after selection sort: ");
		selectionSort(arr);
		for(int i:arr)
			System.out.print(i + " ");
		System.out.println();
	}
}
