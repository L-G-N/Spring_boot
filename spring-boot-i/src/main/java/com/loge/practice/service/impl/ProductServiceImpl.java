/**
 * 
 */
package com.loge.practice.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.loge.practice.model.Product;
import com.loge.practice.service.ProductService;

/**
 * @author LGN
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	private List<Product> products = new ArrayList<>(Arrays.asList(new Product("001", "laptop", "Note book model"),
			new Product("002", "Mouse", "Usb model with 3.0 port"),
			new Product("003", "Play station", "PS4 with updates"), new Product("004", "Monitor", "USB 3.0 with LEB")));

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.loge.practice.service.ProductService#getProdDtls()
	 */
	@Override
	public List<Product> getProdDtls() {
		return products;
	}

	@Override
	public Product getProd(String id) {
		return products.stream().filter(prod -> prod.getId().equals(id)).findFirst().get();
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public void updtProduct(Product product, String id) {
		for (int i = 0; i < products.size(); i++) {

			if (products.get(i).getId().equals(id)) {
				products.set(i, product);
			}
		}
	}

	@Override
	public void dltProd(String id) {
		products.removeIf(prod -> prod.getId().equals(id));
	}

}
