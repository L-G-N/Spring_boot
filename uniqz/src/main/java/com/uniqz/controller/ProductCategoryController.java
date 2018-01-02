/**
 * 
 */
package com.uniqz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uniqz.model.ProductCategory;
import com.uniqz.service.ProductCategoryService;

/**
 * @author LGN
 *
 */
@RestController
public class ProductCategoryController {
	
	@Autowired
	private ProductCategoryService prodService;

	@RequestMapping("/prodctg")
	public List<ProductCategory> getProdDtls(){
		return prodService.getProdDtls();
	}
	
	@RequestMapping("/prodctg/{id}")
	public ProductCategory getProd(@PathVariable String id) {
		return prodService.getProd(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/prodctg")
	public void addProduct(@RequestBody ProductCategory product){
		prodService.addProduct(product);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/prodctg/{id}")
	public void updtProduct(@RequestBody ProductCategory product, @PathVariable String id){
		prodService.updtProduct(product, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/prodctg/{id}")
	public void dltProd(@PathVariable String id) {
		prodService.dltProd(id);
	}
}
