package pack1;

public class Rectangle	{
	private int width=0;
	private int height=0;

	protected void setSides(int width, int height)	{
		this.width = width;
		this.height = height;
	}

	protected int getArea()	{
		return this.width * this.height;
	}
}

class Square	{
	private int side=0;

	protected void setSide(int side)	{
		this.side = side;
	}

	protected int getArea()	{
		return this.side * this.side;
	}
}
