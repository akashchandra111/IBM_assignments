package com.ibm.takehome.service;

import com.ibm.takehome.bean.Product;
import com.ibm.takhome.problem.NullException;

public interface IProductService {
	// interface get and set methods
	Product getProductDetails(Integer productId) throws NullException;
	boolean setProductDetails(Product productToEnlist);
}
