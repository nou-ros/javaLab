public class SwapString{
	public static void main(String args[]){
		String str1 = "Good", str2 = "morning";
		System.out.println("Before swap: " + str1 + " " +str2);
		str1 = str1 + str2;
		str2 = str1.substring(0,(str1.length() - str2.length()));
		str1 = str1.substring(str2.length());
		System.out.println("Strings after swap: " + str1 + " " + str2);
	}
}