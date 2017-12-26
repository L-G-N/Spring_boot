/**
 * 
 */
package com.loge.practice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loge.practice.model.Product;

/**
 * @author LGN
 *
 */
@RestController
public class ProductController {

	@RequestMapping("/products")
	public List<Product> getProdDtls(){
		return Arrays.asList(
				new Product("001","laptop","Note book model"),
				new Product("002","Mouse","Usb model with 3.0 port"),
				new Product("003","Play station","PS4 with updates"),
				new Product("004","Monitor","USB 3.0 with LEB"));
	}
}
