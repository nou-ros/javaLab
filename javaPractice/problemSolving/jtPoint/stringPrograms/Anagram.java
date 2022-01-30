import java.util.Arrays;

public class Anagram{
	public static void main(String [] args)
	{
		String first = "Brag";
		String second = "Grab";

		first = first.toLowerCase();
		second = second.toLowerCase();

		if(first.length() != second.length())
		{
			System.out.println("both the strings are not anagram");
		}else{
			char[] one = first.toCharArray();
			char[] two = second.toCharArray();
			
			Arrays.sort(one);
			Arrays.sort(two);

			if(Arrays.equals(one, two) == true)
			{
				System.out.println("Both the strings are anagram");
			}else{
				System.out.println("Both strings are not anagram");
			}
		}
	}
}
