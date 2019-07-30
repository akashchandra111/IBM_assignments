package vehicle;

public class Vehicle	{
	private byte totalGears;
	private int speed;
	private byte fuelCapacity;
	private byte mileage;
	private String brandName;
	private String type;
	private FuelType fuelType;

	//Parameterized constructor
	public Vehicle(byte totalGears, int speed, byte fuelCapacity, byte mileage, String brandName, String type, FuelType fuelType)	{
		this.totalGears = totalGears;
		this.speed = speed;
		this.fuelCapacity = fuelCapacity;
		this.mileage = mileage;
		this.brandName = brandName;
		this.type = type;
		this.fuelType = fuelType;
	}

	//Default constructor
	public Vehicle()	{

	}

	//Setters
	public void setTotalGears(byte totalGears)	{
		this.totalGears = totalGears;
	}

	public void setSpeed(int speed)	{
		this.speed = speed;
	}

	public void setFuelCapacity(byte fuelCapacity)	{
		this.fuelCapacity = fuelCapacity;
	}

	public void setMileage(byte mileage)	{
		this.mileage = mileage;
	}

	public void setBrandName(String brandName)	{
		this.brandName = brandName;
	}

	public void setType(String type)	{
		this.type = type;
	}

	public void setFuelCapacity(FuelType fuelType)	{
		this.fuelType = fuelType;
	}

	//Getters
	public byte getTotalGears()	{
		return this.totalGears;
	}

	public int getSpeed()	{
		return this.speed;
	}

	public byte getFuelCapacity()	{
		return this.fuelCapacity;
	}

	public byte getMileage()	{
		return this.mileage;
	}

	public String getBrandName()	{
		return this.brandName;
	}

	public String getType()	{
		return this.type;
	}

	public FuelType getFuelType()	{
		return this.fuelType;
	}
}
