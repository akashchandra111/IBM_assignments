import vehicle.car.Car;
import vehicle.FuelType;

class VehicleDriver	{
	public static void main(String... args)	{
		Car teslaModelA = new Car((byte)6, 350, (byte)20, (byte)8, "Tesla Model A", "sport", FuelType.DIESEL);
		Car teslaModelB = new Car((byte)5, 250, (byte)15, (byte)15, "Tesla Model B", "eco", FuelType.PETROL);
		teslaModelA.printDetail();
		teslaModelB.printDetail();
	}
}
