public class StringChar{
	public static void main(String args[]){
		String s = "hello";
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			System.out.println("Char at " + i + " index is: " + c);
		}
		String str = "World";
		char ch[] = str.toCharArray();
		for(int i = 0; i < ch.length; i++){
			System.out.println("Char at " + i + " index is : " + ch[i]);
		}

		char c = 'N';
		String charStr = String.valueOf(c);
		System.out.println(charStr);
		String charStr2 = Character.toString(c);
		System.out.println(charStr);

	}
}
