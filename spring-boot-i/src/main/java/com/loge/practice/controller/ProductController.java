/**
 * 
 */
package com.loge.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loge.practice.model.Product;
import com.loge.practice.service.ProductService;

/**
 * @author LGN
 *
 */
@RestController
public class ProductController {
	
	@Autowired
	private ProductService prodService;

	@RequestMapping("/products")
	public List<Product> getProdDtls(){
		return prodService.getProdDtls();
	}
	
	@RequestMapping("/products/{id}")
	public Product getProd(@PathVariable String id) {
		return prodService.getProd(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/products")
	public void addProduct(@RequestBody Product product){
		prodService.addProduct(product);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/products/{id}")
	public void updtProduct(@RequestBody Product product, @PathVariable String id){
		prodService.updtProduct(product, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/products/{id}")
	public void dltProd(@PathVariable String id) {
		prodService.dltProd(id);
	}
}
