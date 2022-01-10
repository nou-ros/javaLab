public class SumRowColumn{
	public static void main(String args[]){
		int rows, cols, sumRow = 0, sumCol = 0;
		int a[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			};
		rows = a.length;
		cols = a[0].length;
		
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				sumRow += a[i][j];
				sumCol += a[j][i];
			}
			System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
			System.out.println("Sum of " + (i + 1) + " column: " + sumCol);
		};
	}
}
