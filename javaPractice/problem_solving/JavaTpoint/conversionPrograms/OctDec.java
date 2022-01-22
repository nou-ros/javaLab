public class OctDec{
	public static void main(String args[]){
		//octal to decimal
		String octalString = "121";
		int decimal = Integer.parseInt(octalString, 8);
		System.out.println(decimal);
		
		// decimal to octal
		System.out.println(Integer.toOctalString(19));
	}
}
