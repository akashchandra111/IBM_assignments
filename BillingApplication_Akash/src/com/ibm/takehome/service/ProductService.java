package com.ibm.takehome.service;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.dao.ProductDAO;
import com.ibm.takhome.problem.NullException;

public class ProductService implements IProductService	{
	
	// object to communicate to-and-fro with dao class
	private static ProductDAO accessObject;
	
	//Setting the service static vars
	static	{
		ProductService.accessObject = new ProductDAO();
	}

	@Override
	public Product getProductDetails(Integer productId) throws NullException {
		return ProductService.accessObject.getDetails(productId);
	}

	@Override
	public boolean setProductDetails(Product productToEnlist) {
		return ProductService.accessObject.setDetails(productToEnlist);
	}
	
	//returns string with a specific product details
	public String returnString(Integer productId) throws NullException	{
		String returnThis = "";
		
		returnThis += "Product Name:\t\t" + ProductService.accessObject.getId(productId).toString() + "\n";
		returnThis += "Product Category:\t" + ProductService.accessObject.getCategory(productId) + "\n";
		returnThis += "Product Description:\t" + ProductService.accessObject.getDescription(productId) + "\n";
		returnThis += "Product Price:\t\t" + ProductService.accessObject.getPrice(productId) + "\n";
		
		return returnThis;
	}
	
	//returns string with final bill
	public String printFinal(Integer productId, Integer quantity) throws NullException	{
		String returnThis = this.returnString(productId);
		
		returnThis += "Quantity:\t\t" + quantity.toString() + "\n";
		returnThis += "Line Total:\t\t" + new Integer((ProductService.accessObject.getPrice(productId)*quantity)).toString() + "\n";
		
		return returnThis;
	}
}
