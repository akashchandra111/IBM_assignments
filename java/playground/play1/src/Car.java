package vehicle.car;

import vehicle.Vehicle;
import vehicle.FuelType;

public class Car extends Vehicle	{
	private byte currentGear;

	public Car(byte totalGears, int speed, byte fuelCapacity, byte mileage, String brandName, String type, FuelType fuelType)	{
		super(totalGears, speed, fuelCapacity, mileage, brandName, type, fuelType);
		this.currentGear = 0;
	}

	public void setGear(byte gearVal)	{
		this.currentGear = gearVal;
	}

	public byte getGear()	{
		return this.currentGear;
	}

	public void printDetail()	{
		System.out.println("Car Name is: " + this.getBrandName());
		System.out.println("Total Speed is: " + this.getSpeed() + "km/h");
		System.out.println("Mileage is: " + this.getMileage() + "km/l");
		System.out.println("Total Gears are: " + this.getTotalGears());
		System.out.println("Fuel tank capacity: " + this.getFuelCapacity());
		System.out.println("Type of car: " + this.getType());
		System.out.println("Fuel type is: " + this.getFuelType());
		System.out.println();
	}
}
