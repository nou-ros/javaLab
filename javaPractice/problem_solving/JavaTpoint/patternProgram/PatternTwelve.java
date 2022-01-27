public class PatternTwelve{
	public static void main(String args[]){
		for(int row = 0; row < 5; row++){
			int n = 1;
			for(int col = 0; col <= row; col++){
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
	}
}
