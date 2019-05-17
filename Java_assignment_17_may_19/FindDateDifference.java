import java.time.LocalDate;
import java.time.Period;

class FindDateDifference	{
	public static void main(String[] args) {
		System.out.print("Enter Date to find difference with current date [Format: (DD/MM/YYYY)]: ");
		String userDate = new java.util.Scanner(System.in).nextLine();

		Integer day, month, year;
		boolean errorOccured = false;

		do {
			try	{
				day = Integer.parseInt(userDate.split("/")[0]);
				month = Integer.parseInt(userDate.split("/")[1]);
				year = Integer.parseInt(userDate.split("/")[2]);

				Period gap = Period.between(LocalDate.of(year, month, day), LocalDate.now());

				System.out.println("Difference between date is: " + gap.getDays()+ " days, " + gap.getMonths() + " months, " + gap.getYears() + " years.");

				errorOccured = false;
			}
			catch(NumberFormatException npe)	{
				System.out.println("Enter date in given format");
				errorOccured = true;
			}
		} while (errorOccured == true);
	}
}
