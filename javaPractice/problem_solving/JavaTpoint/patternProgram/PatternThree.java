public class PatternThree{
	public static void main(String args[]){
		int i,j,lines=10;
		for(i = 1; i <= lines; i++){
			for(j = 1; j <= i; j++){
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}
}
