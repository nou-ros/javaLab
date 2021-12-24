interface Eatable{
	void eat();
}

public class TestAnonymousInnerOne{
	public static void main(String [] args)
	{
		Eatable eatable = new Eatable(){
			public void eat(){
				System.out.println("Nice Fruits");
			}
		};

		eatable.eat();
	}
}
