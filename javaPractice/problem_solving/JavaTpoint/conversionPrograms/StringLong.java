public class StringLong{
	public static void main(String args[]){
		// String to Long
		String str = "9990449935";
		long value = Long.parseLong(str);
		System.out.println("long: " + value);
		// Long to String
		System.out.println("String: " + String.valueOf(value));
		System.out.println("String: " + Long.toString(value));
	}
}
