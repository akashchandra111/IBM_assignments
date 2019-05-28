package com.ibm.takehome.dao;

import com.ibm.takehome.bean.Product;
import com.ibm.takhome.problem.NullException;

public interface IProductDAO {
	Product getDetails(Integer productCode) throws NullException;
	boolean setDetails(Product productToEnlist);
}