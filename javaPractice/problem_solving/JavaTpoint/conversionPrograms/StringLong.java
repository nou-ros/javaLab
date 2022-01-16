public class StringLong{
	public static void main(String args[]){
		String str = "9990449935";
		long value = Long.parseLong(str);
		System.out.println("long: " + value);
		System.out.println("String: " + String.valueOf(value));
		System.out.println("String: " + Long.toString(value));
	}
}
