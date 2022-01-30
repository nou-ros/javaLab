public class Reverse{
	public static void main(String args[]){
		String str = "Dreams have meaning";
		String reverseStr = "";
		for(int i = str.length()-1; i >= 0; i--)
		       reverseStr += str.charAt(i);
		System.out.println("Reverse : " + reverseStr);	
	}
}
