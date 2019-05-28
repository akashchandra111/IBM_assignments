package com.ibm.takehome.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.takehome.bean.Product;
import com.ibm.takhome.problem.NullException;

public class ProductDAO implements IProductDAO {
	
	private static Map<Integer, Product> hMap;
	
	//Initializing all the static members of class
	static	{
		ProductDAO.hMap = new HashMap<Integer, Product>();
	}

	//Search in the static hashMap and get the details can return Null
	@Override
	public Product getDetails(Integer productCode) throws NullException {
		Product returnThis = ProductDAO.hMap.get(productCode);
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting details");
		}
	}
	
	//returns boolean, used to check if data is already present
	@Override
	public boolean setDetails(Product productToEnlist)	{
		return ProductDAO.hMap.put(productToEnlist.getId(), productToEnlist) != null;
	}
	
	
	//getters for every product attributes
	public Integer getId(Integer productCode) throws NullException	{
		Integer returnThis = this.getDetails(productCode).getId();
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting Id");
		}
	}
	
	public Integer getPrice(Integer productCode) throws NullException	{
		Integer returnThis = this.getDetails(productCode).getPrice();
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting price");
		}
	}	
	
	public String getName(Integer productCode) throws NullException	{
		String returnThis = this.getDetails(productCode).getName();
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting price");
		}
	}
	
	public String getCategory(Integer productCode) throws NullException	{
		String returnThis = this.getDetails(productCode).getCategory();
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting price");
		}
	}
	
	public String getDescription(Integer productCode) throws NullException	{
		String returnThis = this.getDetails(productCode).getDescription();
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting price");
		}
	}
}
