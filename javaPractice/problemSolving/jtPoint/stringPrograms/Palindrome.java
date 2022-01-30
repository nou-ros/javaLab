public class Palindrome{
	public static void main(String args[]){
		String str = "Kayak";
		boolean flag = true;
		str = str.toLowerCase();
		for(int i = 0; i < str.length()/2; i++){
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
