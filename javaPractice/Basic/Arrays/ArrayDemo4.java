public class ArrayDemo4{
	public static void main(String args[]){
		int A[][] = new int[3][4];
		int B[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

		for(int i = 0; i < 3; i++){
			for(int j = 0; j< 4; j++){
				//System.out.print(B[i][j] + " ");
			}
			//System.out.println();
		}

		int C[][][] = { {{1, 2, 11, 12}, {3, 4, 13, 14}}, {{5, 6, 15, 16}, {6, 7, 17, 18}}, {{8, 9, 19, 20}, {10, 11, 21, 22}} };
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				for(int k = 0; k < 4; k++){
					System.out.print(C[i][j][k] + " ");
				}
				System.out.println();
			}	
			System.out.println();
		}
	}
}
