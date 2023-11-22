package com.sellerpage.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.sellerpage.model.Products;
import com.sellerpage.dao.ProductDAO;
import com.sellerpage.exception.ProductExistsException;

@Service
// @Service marks a Java class that performs some service,
//such as executing business logic, performing 
//calculations, and calling external APIs.
//Here JPA repository has lots of predefined generic methods to perform the database operation. 
public class ProductService implements IProductService {

	 @Autowired
	   private ProductDAO productDAO;
	

	@Override
	public Products createProducts(Products products) throws ProductExistsException {
		Optional<Products> productNew =productDAO.findById(products.getProductid());
        if(productNew.isPresent())
            throw new ProductExistsException();
        else
            return productDAO.save(products);
	}
	

	@Override
	public void updateProduct(int productid, Products products) {
		productDAO.findById(productid).get();
        productDAO.save(products);
		
	}

	@Override
	public void deleteProduct(int productid) {
		productDAO.deleteById(productid);
		
	}
	
	@Override
	public List<Products> getAllProducts() {
		List<Products> productList = productDAO.findAll();
        if(productList.size()>0)
            return productList;
        else
            return null;

    }
	
	@Override
	public List<Products> getProductById(int productid) {
        return productDAO.findByProductid(productid);

    }
	
	
	
}