/**
 * 
 */
package com.loge.practice.service;

import java.util.List;

import com.loge.practice.model.Product;

/**
 * @author LGN
 *
 */
//@Service
public interface ProductService {
	
	List<Product> getProdDtls();

	Product getProd(String id);

	void addProduct(Product product);

	void updtProduct(Product product, String id);

	void dltProd(String id);

}
