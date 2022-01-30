public class PatternTen{
	public static void main(String args[]){
		int i, j, iter = 5;
		for(i = 0; i < iter; i++){
			for(j = iter; j > i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
