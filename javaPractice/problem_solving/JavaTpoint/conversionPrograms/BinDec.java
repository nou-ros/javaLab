public class BinDec{
	public static void main(String args[]){
		// Binary to decimal
		String binaryString = "1010";
		int decimal = Integer.parseInt(binaryString, 2);
		System.out.println(decimal);
		
		// decimal to binary
		System.out.println(Integer.toBinaryString(10));
	}
}
