public class StaticVar{
	static int m = 100;

	void method()
	{
		int n = 90;
		System.out.println(n);
	}

	public static void main(String[] args)
	{
		int data = 50;
		System.out.println(data);
		System.out.println(m);
		
		StaticVar var = new StaticVar();
		var.method();
	}
}
