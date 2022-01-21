public class IntChar{
	public static void main(String args[]){
		// char to int
		char c = 'a';
		char c2 = '1';
		int i = c;
		int i2 = c2;
		System.out.println(i + " " + i2);
		
		char c3 = '2';
		int i3 = Character.getNumericValue(c);
		System.out.println(i3);

		char c4 = '9';
		int i4 = Integer.parseInt(String.valueOf(c4));
		System.out.println(i4);

		// int to char
		int i5 = 65;
		char c5 = (char)i5;
		System.out.println(c5);
	}
}
