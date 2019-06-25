package com.ibm.training.model;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.ibm.training.bean.Laptop;
import com.ibm.training.helper.LaptopException;

//Laptop Holder class which contains laptop objects in it and manages them
@Repository
public class LaptopsHolder implements LaptopHolderInteface	{
	//ArrayList to hold all the laptop details entered by user
	private ArrayList<Laptop> laptopCollection;

	//Default Constructor
	public LaptopsHolder()	{
		//Initializing ArrayList and adding new Laptop object for testing purpose
		this.laptopCollection = new ArrayList<Laptop>();
		this.laptopCollection.add(new com.ibm.training.bean.Laptop());
	}

	//Method to add laptop to ArrayList; also checks for exception if same uid is present
	public void addLaptop(Integer id, Integer hddSize, Integer ramSize, Integer graphicsSize, String brandName)	{
		Laptop checkLaptop = null;
		for(Object obj: this.laptopCollection)	{
			if(((Laptop)obj).getId().equals(id))	{
				checkLaptop = (Laptop)obj;
				break;
			}
		}

		try	{
			if(checkLaptop == null)	{
				this.laptopCollection.add(new Laptop(id, hddSize, ramSize, graphicsSize, brandName));
				System.out.println("Laptop Data Added in the list!");
			}
			else	{
				throw new LaptopException("User Id might be duplicate!");
			}
		}
		catch(LaptopException e)	{
			System.out.println(e);
		}
	}

	//Method to remove laptop to ArrayList and checks if the uid is not present
	public void removeLaptop(Integer id)	{
		Laptop laptopToRemove = null;
		for(Object obj: this.laptopCollection)	{
			if (((Laptop)obj).getId().equals(id))	{
				laptopToRemove = (Laptop)obj;
				break;
			}
		}

		try	{
			if(laptopToRemove != null)	{
				this.laptopCollection.remove(laptopToRemove);
				System.out.println("Laptop data removed from list!");
			}
			else	throw new LaptopException("Id is not found in the list!");
		}
		catch(LaptopException e)	{
			System.out.println(e);
		}
	}

	//Method to update a current laptop object if present (uid exists) with proper change that can be done to any attribute of laptop
	public void updateLaptop(Integer id, String whatToUpdate, String updatedValue)	{
		Laptop laptopToUpdate = null;
		for(Object obj: this.laptopCollection)	{
			if (((Laptop)obj).getId().equals(id))	{
				laptopToUpdate = (Laptop)obj;
				break;
			}
		}

		try	{
			if(laptopToUpdate != null)	{
				if(whatToUpdate.equalsIgnoreCase("id"))	{
					laptopToUpdate.setId(Integer.parseInt(updatedValue));
					System.out.println("Laptop Id updated!");
				}
				else if(whatToUpdate.equalsIgnoreCase("ram"))	{
					laptopToUpdate.setRamSize(Integer.parseInt(updatedValue));
					System.out.println("Laptop ram updated!");
				}
				else if(whatToUpdate.equalsIgnoreCase("hdd"))	{
					laptopToUpdate.setHddSize(Integer.parseInt(updatedValue));
					System.out.println("Laptop hdd updated!");
				}
				else if(whatToUpdate.equalsIgnoreCase("graphics"))	{
					laptopToUpdate.setGraphicsSize(Integer.parseInt(updatedValue));
					System.out.println("Laptop graphics updated!");
				}
				else if(whatToUpdate.equalsIgnoreCase("brand"))	{
					laptopToUpdate.setBrandName(updatedValue);
					System.out.println("Laptop brand updated!");
				}
				else	{
					System.out.println("Wrong criteria selected!");
				}
			}
			else	{
				throw new LaptopException("Nothing is updated, wrong update criteria passed!");
			}
		}
		catch(LaptopException e)	{
			System.out.println(e);
		}
	}

	//Method to search laptop on basis of uid and print it's information
	public void getLaptop(Integer id)	{
		Laptop printThisLaptopInfo = null;
		for(Object obj: this.laptopCollection)	{
			if(((Laptop)obj).getId().equals(id))	{
				printThisLaptopInfo = (Laptop)obj;
				break;
			}
		}

		try	{
			if(printThisLaptopInfo != null)	System.out.println(printThisLaptopInfo);
			else	throw new LaptopException("Laptop Id was not found in the list!");
		}
		catch(LaptopException npe)	{
			System.out.println(npe);
		}
	}

	//Method to see all the laptops present
	public void viewAllLaptops()	{
		try	{
			if(this.laptopCollection.size() < 1)	throw new LaptopException("NO laptops are present in list!");
		}
		catch(LaptopException e)	{
			System.out.println(e);
		}

		for(Object obj: this.laptopCollection)	{
			System.out.println((Laptop)obj);
		}
	}
}
