import java.text.DateFormat;
import java.util.Date;

class DateFormatting	{
	public static void main(String[] args) {
		Date date = new Date(100000000000L);

		DateFormat dFormat[] = new DateFormat[6];

		dFormat[0] = DateFormat.getInstance();
		dFormat[1] = DateFormat.getDateInstance();
		dFormat[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dFormat[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dFormat[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dFormat[5] = DateFormat.getDateInstance(DateFormat.FULL);

		for(DateFormat d: dFormat)	System.out.println("Date: " + d.format(date));
	}
}
