class VowelConstantCount{
	public static void main(String[] args)
	{
		int vowel=0,constant=0;
			String str = "This is really simple sentence";
			str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowel++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				constant++;
			}
		}
		System.out.println("Vowels: "+vowel+" Constant: "+constant);
	}
}
