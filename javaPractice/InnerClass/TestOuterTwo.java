public class TestOuterTwo{
	static int data = 30;
	static class Inner{
		static void msg()
		{
			System.out.println("Data is " + data);
		}
	}

	public static void main(String[] args)
	{
		TestOuterTwo.Inner.msg();
	}
}
