public class PatternSeven{
	public static void main(String args[]){
		int n = 4;
		for(int i = 0; i <= 4; i++){
			for(int j = 0; j <= i; j++)
				System.out.print((char)(65 + i) + " ");
			System.out.println();
		}
	}
}
