interface Showable{
	void show();
	interface Message{
		void msg();
	}
}

public class TestNestedInterfaceOne implements Showable.Message{
	public void msg(){
		System.out.println("Hello Nested Interface");
	}

	public static void main(String[] args)
	{
		Showable.Message message = new TestNestedInterfaceOne();
		message.msg();
	}
}
