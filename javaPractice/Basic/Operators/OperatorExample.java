public class OperatorExample{
	public static void main(String[] args)
	{
		int x=10;
		
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);

		int a = 10;
		int b = 10;

		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
		System.out.println(b);

		int m = 10;
		int n = -10;

		boolean c = true;
		boolean d = false;

		System.out.println(~m);
		System.out.println(~n);
		System.out.println(!c);
		System.out.println(!d);

		System.out.println(10 * 10 / 5 + 3 + 1 * 4 / 2);

		System.out.println(10 << 2);
		System.out.println(10 << 3);
		System.out.println(20 << 2);
		System.out.println(15 << 4);
		
		System.out.println(10 >> 2);
		System.out.println(10 >> 3);
		System.out.println(20 >> 2);
		System.out.println(15 >> 4);

		System.out.println(a < b && a < m);
		System.out.println(a < b && a < n);
		
		System.out.println(a+" " +b);
		int min = (a < b)? a : b;
		System.out.println(min);
	}
}
