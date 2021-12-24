class A {
	interface Message{
		void msg();
	}
}

public class TestNestedInterfaceTwo implements A.Message{
	public void msg(){
		System.out.println("Hello Nested Interface");
	}
	
	public static void main(String[] args)
	{
		A.Message message = new TestNestedInterfaceTwo();
		message.msg();
	}
}
