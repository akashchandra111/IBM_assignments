import java.util.Date;

class UnixDateDemo	{
	public static void main(String... args)	{
		Date date = new Date(10000000L);

		System.out.println("Date: " + date);
		System.out.println("Date: " + date.toString());	//Technically the same thing

		date.setTime(date.getTime() + 100000000L);
		System.out.println("After setting Date: " + date.toString());
	}
}
