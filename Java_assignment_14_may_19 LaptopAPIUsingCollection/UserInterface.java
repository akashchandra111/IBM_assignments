//import com.dev.Laptop;
import com.dev.devlist.LaptopsHolder;
import java.util.Scanner;
import com.enums.OperationEnum;

public class UserInterface	{
	public static void main(String... args)	{
		new UserInterface().questionUser();
	}

	public void questionUser()	{
		Scanner intScanner = new Scanner(System.in);
		Scanner stringScanner = new Scanner(System.in);

		LaptopsHolder laptopHolder = new LaptopsHolder();

		boolean flag = false;

		System.out.println("Laptop Descriptor: ");

		do {
			System.out.println("Choose your option: \n[1->Add]\t[2->Update]\t[3->View]\t[4->View All]\t[5->Delete]\t[6->exit]\n");
			Integer option = intScanner.nextInt();
			Integer id;

			switch(option)	{
				case 1:
					System.out.print("Enter ID: ");
					id = intScanner.nextInt();
					System.out.print("Enter Hard disk size: ");
					Integer hddSize = intScanner.nextInt();
					System.out.print("Enter Ram size: ");
					Integer ramSize = intScanner.nextInt();
					System.out.print("Enter graphics card size: ");
					Integer graphicsSize = intScanner.nextInt();
					System.out.print("Enter brand name: ");
					String brandName = stringScanner.nextLine();
					laptopHolder.addLaptop(id, hddSize, ramSize, graphicsSize, brandName);
					flag = true;
					break;
				case 2:
					System.out.print("Enter ID: ");
					id = intScanner.nextInt();
					System.out.print("Select what to update: \n[1->id]\t[2->ram]\t[3->hdd]\t[4->graphics]\t[5->brand]\n");
					int updateThis = intScanner.nextInt();
					String whatToUpdate = "";
					switch(updateThis)	{
						case 1:
							whatToUpdate = "id";
							break;
						case 2:
							whatToUpdate = "ram";
							break;
						case 3:
							whatToUpdate = "hdd";
							break;
						case 4:
							whatToUpdate = "graphics";
							break;
						case 5:
							whatToUpdate = "brand";
							break;
						default:
							whatToUpdate = "";
					}
					System.out.print("Enter value: ");
					String updatedValue = stringScanner.nextLine();
					laptopHolder.updateLaptop(id, whatToUpdate, updatedValue);
					flag = true;
					break;
				case 3:
					System.out.print("Enter ID: ");
					id = intScanner.nextInt();
					laptopHolder.getLaptop(id);
					flag = true;
					break;
				case 4:
					laptopHolder.viewAllLaptops();
					flag = true;
					break;
				case 5:
					System.out.print("Enter ID: ");
					id = intScanner.nextInt();
					laptopHolder.removeLaptop(id);
					flag = true;
					break;
				case 6:
					flag = false;
					break;
				default:
					System.out.println("Wrong input passed, please try again!");
			}
		}while(flag != false);
	}
}
