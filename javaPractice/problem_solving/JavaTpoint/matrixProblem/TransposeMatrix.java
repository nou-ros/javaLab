public class TransposeMatrix{
	public static void main(String args[]){
		int rows, cols;
		int a[][] = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		rows = a.length;
		cols = a[0].length;
		int trans[][] = new int[cols][rows];

		for(int i = 0; i < cols; i++){
			for(int j = 0; j < rows; j++){
				trans[i][j] = a[j][i];
			}
		}
		System.out.println("Transponse of given matrix");
		for(int i = 0; i < cols; i++){
			for(int j = 0; j < rows; j++){
				System.out.print(trans[i][j] + " ");
			}
			System.out.println();
		}
	}
}
