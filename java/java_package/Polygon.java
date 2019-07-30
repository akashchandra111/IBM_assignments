import pack1.Rectangle;

class Polygon extends Rectangle	{
	public static void main(String... args)	{
		Polygon p = new Polygon();
		p.setSides(20, 40);
		System.out.println("Rectangle area is: " + p.getArea());
	}
}
