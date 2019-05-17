import java.util.Scanner;


class ValidateUsername	{
	public static void main(String[] args) {
		boolean errorOccured = false;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter username to validate (minimum 8chars ending with _job): ");
			String userNameToValidate = scan.nextLine();

			if(userNameToValidate.matches("^\\b[a-zA-Z][a-zA-Z0-9\\-._]{8,}(_job)$"))	{
				System.out.println("Username accepted!");
				errorOccured = false;
			}
			else	{
				System.out.println("Username not valid, enter again!");
				errorOccured = true;
			}
		}
		while(errorOccured == true);
	}
}
