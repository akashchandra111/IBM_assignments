package com.dev.devlist;

import java.util.ArrayList;
import com.dev.Laptop;
import com.dev.exception.LaptopException;

public class LaptopsHolder	{
	private ArrayList laptopCollection;

	public LaptopsHolder()	{
		this.laptopCollection = new ArrayList();
		this.laptopCollection.add(new Laptop());
	}

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
				}
				else if(whatToUpdate.equalsIgnoreCase("ram"))	{
					laptopToUpdate.setRamSize(Integer.parseInt(updatedValue));
				}
				else if(whatToUpdate.equalsIgnoreCase("hdd"))	{
					laptopToUpdate.setHddSize(Integer.parseInt(updatedValue));
				}
				else if(whatToUpdate.equalsIgnoreCase("graphics"))	{
					laptopToUpdate.setGraphicsSize(Integer.parseInt(updatedValue));
				}
				else if(whatToUpdate.equalsIgnoreCase("brand"))	{
					laptopToUpdate.setBrandName(updatedValue);
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
