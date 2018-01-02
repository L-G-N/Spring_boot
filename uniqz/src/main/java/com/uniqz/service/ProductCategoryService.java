/**
 * 
 */
package com.uniqz.service;

import java.util.List;

import com.uniqz.model.ProductCategory;


/**
 * @author LGN
 *
 */
//@Service
public interface ProductCategoryService {
	
	List<ProductCategory> getProdDtls();

	ProductCategory getProd(String id);

	void addProduct(ProductCategory product);

	void updtProduct(ProductCategory product, String id);

	void dltProd(String id);

}
