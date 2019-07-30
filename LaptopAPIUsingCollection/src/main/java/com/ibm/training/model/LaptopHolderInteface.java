package com.ibm.training.model;

public interface LaptopHolderInteface {
	public void addLaptop(Integer id, Integer hddSize, Integer ramSize, Integer graphicsSize, String brandName);
	public void removeLaptop(Integer id);
	public void updateLaptop(Integer id, String whatToUpdate, String value);
	public void getLaptop(Integer id);
	public void viewAllLaptops();
}
