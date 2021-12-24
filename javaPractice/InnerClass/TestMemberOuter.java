public class TestMemberOuter{
	private int data = 30;

	class Inner{
		void msg()
		{
			System.out.println("data is " + data);
		}
	}

	public static void main(String [] args)
	{
		TestMemberOuter object = new TestMemberOuter();
		TestMemberOuter.Inner inner = object.new Inner();

		inner.msg();
	}
}
