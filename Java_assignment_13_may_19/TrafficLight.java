import java.util.Scanner;

enum TrafficLightColor{
	RED, YELLOW, GREEN, NIL;
}

class TrafficLight	{

	public static void main(String... args)	{
		System.out.println("Enter color initial to show it's signal message: ");
		String colorInitial = new Scanner(System.in).nextLine();

		if(colorInitial.charAt(0) == 'g')	TrafficLight.showMessage(TrafficLightColor.GREEN);
		else if(colorInitial.charAt(0) == 'r')	TrafficLight.showMessage(TrafficLightColor.RED);
		else if(colorInitial.charAt(0) == 'y')	TrafficLight.showMessage(TrafficLightColor.YELLOW);
		else TrafficLight.showMessage(TrafficLightColor.NIL);
	}

	public static void showMessage(TrafficLightColor color)	{
		switch(color)	{
			case RED:
				System.out.println("Stop!");
				break;
			case YELLOW:
				System.out.println("Wait!");
				break;
			case GREEN:
				System.out.println("Go!");
				break;
			default:
				System.out.println("Wrong signal!");
		}
	}
}
