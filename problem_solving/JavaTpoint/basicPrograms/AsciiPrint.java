import java.util.Scanner;


class AsciiPrint{
	private char char_value;

	AsciiPrint(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character: ");
		this.char_value = scan.next().charAt(0);
	}

	protected void char_to_int(){
		int ascii_value = char_value;
		System.out.println("The ascii value of " + char_value + " is: "+ascii_value);
	}

	public static void main(String[] args){
		AsciiPrint charac = new AsciiPrint();
		charac.char_to_int();
		charac.list_of_ascii();
	}
	
	protected void list_of_ascii()
	{
		for(int i=65;i<=126;i++)
		{
			//type casting
			System.out.println("The ASCII value of " + (char)i + " = " + i);
		}
	}
}


