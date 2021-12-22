abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape{
	void draw()
	{
		System.out.println("Drawing Circle");
	}

	void hello()
	{
		System.out.println("hello");
	}
}

public class TestAbstraction{
	public static void main(String [] args)
	{
		Shape shape = new Circle();
		shape.draw();
	}
}
