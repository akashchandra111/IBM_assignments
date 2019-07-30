package com.ibm.training.bean;

public class Laptop	{
	private Integer hddSize, ramSize, graphicsSize, id;
	private String brandName;

	//Constructors
	//[default]
	public Laptop()	{
		this.id = 999;
		this.hddSize = 0;
		this.ramSize = 0;
		this.graphicsSize = 0;
		this.brandName = "none";
	}

	//[parameterized]
	public Laptop(int id, int hddSize, int ramSize, int graphicsSize, String brandName)	{
		this.id = id;
		this.hddSize = hddSize;
		this.ramSize = ramSize;
		this.graphicsSize = graphicsSize;
		this.brandName = brandName;
	}

	//Getters
	public Integer getId()	{
		return this.id;
	}

	public Integer getHddSize()	{
		return this.hddSize;
	}

	public Integer getRamSize()	{
		return this.ramSize;
	}

	public Integer getGraphicsSize()	{
		return this.graphicsSize;
	}

	public String getBrandName()	{
		return this.brandName;
	}

	//Setters
	public void setId(Integer id)	{
		this.id = id;
	}

	public void setHddSize(Integer hddSize)	{
		this.hddSize = hddSize;
	}

	public void setRamSize(Integer ramSize)	{
		this.ramSize = ramSize;
	}

	public void setGraphicsSize(Integer graphicsSize)	{
		this.graphicsSize = graphicsSize;
	}

	public void setBrandName(String brandName)	{
		this.brandName = brandName;
	}

	//toString() method to print Laptop object in System.out.println();
	public String toString()	{
		return "This " + this.brandName + " laptop, id: " + this.id + " has " + this.ramSize + "gb of ram and " + this.hddSize +"gb of hard drive space with " + this.graphicsSize + "gb of graphics memory.";
	}
}
