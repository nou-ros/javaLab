public class HexDec{
	public static void main(String args[]){
		// hex to decimal
		String hex = "a";
		int decimal = Integer.parseInt(hex, 16);
		System.out.println(decimal);

		// decimal to hex 
		System.out.println(Integer.toHexString(10));
	}
}
