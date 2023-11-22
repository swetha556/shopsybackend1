package com.sellerpage.dao;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sellerpage.model.Products;

@Repository
//@Repository is a Spring annotation that
//indicates that the decorated class is a repository.
public interface ProductDAO extends JpaRepository<Products, Integer>{


	public List<Products> findByProductid(int productid);
	
	

}
