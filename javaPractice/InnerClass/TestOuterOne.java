public class TestOuterOne{
	static int data = 30;
	static class Inner{
		void msg()
		{
			System.out.println("Data is " + data);
		}
	}
	
	public static void main(String[] args)
	{
		TestOuterOne.Inner innerObject = new TestOuterOne.Inner();
		innerObject.msg();
	}
}
