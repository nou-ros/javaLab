

public class StringIntConversion{
	public static void main(String args[]){
		stringToInt("200");
		intToString(200);
	}

	public static void stringToInt(String str){	
		System.out.println(Integer.parseInt(str));
	}

	public static void intToString(int value){
		String str = String.valueOf(value);
		System.out.println(value + 100);
		System.out.println(str + 100);
	}
}
