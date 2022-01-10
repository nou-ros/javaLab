import java.util.Scanner;

class PalinCheck{
	private	int num;
	private String word;
	
	PalinCheck(int number)
	{
		this.num = number;
	}

	PalinCheck(String word)
	{
		this.word=word;
	}
	
	private void numCheck(){
		int rem,sum=0,num=this.num;
		while(num!=0)
		{
			rem = num%10;
			num = num/10;
			sum = sum*10+rem;
		}
		System.out.println(sum);
		System.out.println(this.num);
		if(sum==this.num){
			System.out.println("Palindrome");	
		}
		else{
			System.out.println("Not Palindrome");
		}
	}

	private void wordCheck(){
		String reverse = "";
		int length = this.word.length();
		for (int i=length-1;i>=0;i--)
		{
			reverse = reverse+this.word.charAt(i);
		}

		if(reverse.equals(this.word))
		{	
			System.out.println("Palindrome");	
		}
		else{
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args)
	{
		Scanner item = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = item.nextLine();	
		PalinCheck value = new PalinCheck(word);
		value.wordCheck();
	}
}	
