package com.ibm.training.controller;

import org.springframework.stereotype.Controller;

import com.ibm.training.bean.Laptop;
import com.ibm.training.model.LaptopsHolder;

@Controller
public class LaptopHolderController implements LaptopHolderControllerInteface {
	
	private LaptopsHolder laptopsHolder;

	public LaptopHolderController()	{
		laptopsHolder = new LaptopsHolder();
	}
	
	public LaptopHolderController(Laptop[] laptops)	{
		this();
		this.addLaptop(laptops);
	}
	
	public LaptopHolderController(Laptop laptop)	{
		this();
		this.addLaptop(laptop);
	}
	
	public void addLaptop(Laptop[] laptops)	{
		for(Laptop laptop: laptops)	{
			this.addLaptop(laptop);
		}
	}

	public void addLaptop(Laptop laptop)	{
		this.addLaptop(laptop.getId(), laptop.getHddSize(), laptop.getRamSize(), laptop.getGraphicsSize(), laptop.getBrandName());
	}
	
	@Override
	public void addLaptop(Integer id, Integer hddSize, Integer ramSize, Integer graphicsSize, String brandName) {
		this.laptopsHolder.addLaptop(id, hddSize, ramSize, graphicsSize, brandName);
	}

	@Override
	public void removeLaptop(Integer id) {
		this.laptopsHolder.removeLaptop(id);
	}

	@Override
	public void updateLaptop(Integer id, String whatToUpdate, String updatedValue) {
		this.laptopsHolder.updateLaptop(id, whatToUpdate, updatedValue);
	}

	@Override
	public void getLaptop(Integer id) {
		this.laptopsHolder.getLaptop(id);
	}

	@Override
	public void viewAllLaptops() {
		this.laptopsHolder.viewAllLaptops();
	}

}
