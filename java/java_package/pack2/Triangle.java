package pack2;

public class Triangle	{
	private float base=0.0f;
	private float height=0.0f;

	protected void setSide(float base, float height)	{
		this.base = base;
		this.height = height;
	}

	protected float getArea()	{
		return (0.5f * this.base * this.height);
	}
}
