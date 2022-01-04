public class InsertionSort{
	public static void main(String args[]){
		int arr[] = {9, 14, 3, 2,43, 11, 58, 22};
		int n = arr.length;
		System.out.println("Before insertion sort: ");
		for(int i:arr){
			System.out.print(i + " ");
		}
		for(int j = 1; j < n; j++){
			int key = arr[j];
			int i = j - 1;
			while((i > -1) && (arr[i] > key)){
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
		System.out.println();
		System.out.println("After insertion sort: ");
		for(int i: arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
