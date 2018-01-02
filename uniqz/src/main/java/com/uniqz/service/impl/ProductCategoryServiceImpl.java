/**
 * 
 */
package com.uniqz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniqz.dao.ProdecutCategoryDAO;
import com.uniqz.model.ProductCategory;
import com.uniqz.service.ProductCategoryService;

/**
 * @author LGN
 *
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Autowired
	private ProdecutCategoryDAO prodCtgDao;

	@Override
	public List<ProductCategory> getProdDtls() {
		List<ProductCategory> categories = new ArrayList<>();
		prodCtgDao.findAll().forEach(categories::add);
		return categories;
	}

	@Override
	public ProductCategory getProd(String id) {
		return prodCtgDao.findOne(id);
	}

	@Override
	public void addProduct(ProductCategory product) {
		prodCtgDao.save(product);
	}

	@Override
	public void updtProduct(ProductCategory product, String id) {
		prodCtgDao.save(product);
		
	}

	@Override
	public void dltProd(String id) {
		prodCtgDao.delete(id);		
	}



}
