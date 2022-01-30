public class PatternFive{
	public static void main(String args[]){
		int lines = 4;
		int i, j;
		for(i = 0; i < lines; i++){
			for(j = 1; j <= lines; j++){
				if(j <= (lines - i))
					System.out.print(j);
				else
					System.out.print("*");
			}
			j--;
			while(j > 0){
				if(j > (lines - i))
					System.out.print("*");
				else
					System.out.print(j);
				j--;
			}
			System.out.println("");
		}

	}
}
