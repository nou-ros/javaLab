abstract class Person{
	abstract void eat();
}

public class TestAnonymousInner{
	public static void main(String [] args)
	{
		Person person = new Person(){
			void eat()
			{
				System.out.println("Nice Fruits");
			}
		};

		person.eat();
	}
}
