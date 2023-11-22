package com.sellerpage.service;


import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sellerpage.exception.ProductExistsException;
import com.sellerpage.model.Products;

public interface IProductService {
	public List<Products> getAllProducts();
	public Products createProducts(Products products) throws ProductExistsException ;
	public void deleteProduct(int productid);
	public void updateProduct(int productid, Products products);
	public List<Products> getProductById(int productid);
		



	
}