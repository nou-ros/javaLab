public class OddEvenFrequency{
	public static void main(String args[]){
		int a[][] = { {4, 3, 2}, {3, 5, 7}, {8, 2, 6} };
		int rows, cols, countEven = 0, countOdd = 0;
		rows = a.length;
		cols = a[0].length;
		System.out.println(rows + " " +cols);
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(a[i][j] % 2 == 0){
					countEven++;
					continue;
				}
				countOdd++;
			}
		}
		System.out.println("Odd numbers: " + countOdd);
		System.out.println("Even numbers: " + countEven);
	}
}
