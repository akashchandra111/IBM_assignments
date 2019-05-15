//import com.dev.Laptop;
import java.util.InputMismatchException;

import com.dev.devlist.LaptopsHolder;
import java.util.Scanner;
import com.enums.OperationEnum;

public class UserInterface	{
	public static void main(String... args)	{
		//Calling the method questionUser to anonymous object (forever loop)
		new UserInterface().questionUser();
	}

	public void questionUser()	{
		//Made 2 scanner objects because intScanner was not taking string elements using method nexLine();
		//That's why 2 scanner objects are created here
		Scanner intScanner = new Scanner(System.in);
		Scanner stringScanner = new Scanner(System.in);

		//Initializing the holder class and inturn it initializes the ArrayList behind the scene
		LaptopsHolder laptopHolder = new LaptopsHolder();

		//flag which decides whether the loop will be run next time if true;
		boolean flag = false;

		System.out.println("Laptop Descriptor: ");

		//Calling appropriate methods where required!
		do {
			System.out.println("Choose your option: \n[1->Add]\t[2->Update]\t[3->View]\t[4->View All]\t[5->Delete]\t[6->exit]\n");
			Integer option = null;
			try	{
			option = Integer.parseInt(stringScanner.nextLine());
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
			}
			catch(InputMismatchException e)	{
				System.out.println("Exception: " + e);
			}
			catch(Exception e)	{
				System.out.println("Exception: " + e);
			}
			finally	{
				if (!option.equals(6))	{
					System.out.println("You might have entered wrong value at number field");
					flag = true;
				}
				else	{
					System.out.println("Exiting the program...");
				}
			}
		}while(flag != false);
	}
}
