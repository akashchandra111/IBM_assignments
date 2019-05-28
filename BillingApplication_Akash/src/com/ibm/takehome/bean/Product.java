package com.ibm.takehome.bean;

// Main product class with default, parameterized and all setters and getters
public class Product {
	private Integer id, price;
	private String name, category, description;
	
	public Product()	{
		this.id = 0;
		this.price = 0;
		this.name = "";
		this.category = "not found";
		this.description = "no description";
	}
	
	public Product(Integer id, Integer price, String name, String category, String description) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.category = category;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
