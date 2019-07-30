enum WeekDay	{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	WeekDay()	{
		System.out.println("Selected Weekday is: " + this);
	}
}

class EnumTest	{
	public static void main(String... args)	{
	for(WeekDay wd: WeekDay.values())	System.out.println("Weekday: " + wd);
	}
}
