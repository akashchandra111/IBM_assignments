package com.ibm.training.controller;

public interface LaptopHolderControllerInteface {
	public void addLaptop(Integer id, Integer hddSize, Integer ramSize, Integer graphicsSize, String brandName);
	public void removeLaptop(Integer id);
	public void updateLaptop(Integer id, String whatToUpdate, String value);
	public void getLaptop(Integer id);
	public void viewAllLaptops();
}
