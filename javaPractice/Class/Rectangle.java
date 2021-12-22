public class Rectangle{
	public int width = 0;
	public int height = 0;
	public Point origin;

	public Rectangle()
	{
		origin = new Point(0, 0);
	}

	public Rectangle(Point point)
	{
		origin = point;
	}

	public Rectangle(int width, int height)
	{
		origin = new Point(0, 0);
	}

	public Rectangle(Point point, int width, int height)
	{
		this.origin = point;
		this.width = width;
		this.height = height;
	}

	public void move(int x, int y)
	{
		origin.x = x;
		origin.y = y;
	}

	public int getArea()
	{
		return width*height;
	}
}
