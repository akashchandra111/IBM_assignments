class RuntimePoly	{
	public static void main(String... args)	{

	}
}

class Car	{
	private String type;
	private String brand;
	private int speed;
	private int capacity;
	private int mileage;

	public void setType(String setType){

	}
	public String getType()	{
		return this.type;
	}
	public void setBrand(String setBrand)	{

	}
	public String getBrand()	{
		return this.brand;
	}
	public void setSpeed(int setSpeed)	{

	}
	public int getSpeed()	{
		return this.speed;
	}
	public void setCapacity(int setCapacity)	{

	}
	public int getCapacity()	{
		return this.capacity;
	}
	public void setMileage(int setMileage)	{

	}
	public int getMileage()	{
		return this.mileage;
	}
}

class Lamborghini extends Car	{
	Lamborghini(String setType, String setBrand, int setSpeed, int setCapacity, int setMileage)	{
		this.setType(setType);
		this.setBrand(setBrand);
		this.setSpeed(setSpeed);
		this.setCapacity(setCapacity);
		this.setMileage(setMileage);
	}

	// setters
	@Override
	public void setType(String setType)	{
		super.setType(setType);
	}

	@Override
	public void setBrand(String setBrand)	{
		super.setBrand(setBrand);
	}

	@Override
	public void setSpeed(int setSpeed)	{
		super.setSpeed(setSpeed);
	}

	@Override
	public void setCapacity(int setCapacity)	{
		super.setCapacity(setCapacity);
	}

	@Override
	public void setMileage(int setMileage)	{
		super.setMileage(setMileage);
	}

	@Override
	public String getType()	{
		return super.getType();
	}

	@Override
	public String getBrand()	{
		return super.getBrand();
	}

	@Override
	public int getSpeed()	{
		return super.getSpeed();
	}

	@Override
	public int getCapacity()	{
		return super.getCapacity();
	}

	@Override
	public int getMileage()	{
		return super.getMileage();
	}
}
