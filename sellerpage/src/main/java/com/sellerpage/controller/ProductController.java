package com.sellerpage.controller;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.sellerpage.model.Orders;
import com.sellerpage.model.Payment;
import com.sellerpage.model.Products;
import com.sellerpage.service.IProductService;
import com.sellerpage.model.Rating;
import com.sellerpage.exception.ProductExistsException;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/sell")
public class ProductController {
	
	@GetMapping("/greet")
    public String welcome(){
        return "Seller page is working";
    }

	@Autowired
	private IProductService service;
	
	
	@GetMapping("/products")
	public List<Products> getAllProducts(){	
		return service.getAllProducts();
	}

	@GetMapping("/products/{productid}")
    public List<Products> getProductById(@PathVariable int productid) {
        return service.getProductById(productid);

    }
	
	@PostMapping(value="/products")
		public ResponseEntity<?> createProducts(@RequestBody Products products  ) throws ProductExistsException {
		return new ResponseEntity<>(service.createProducts(products), HttpStatus.CREATED);
	} 
	

	

//	
	
	@PutMapping("/products/{productid}")//requestbody - the body of web request will be assigned to products parameter.
	public void updateProduct(@PathVariable int productid ,@RequestBody Products products) {
		service.updateProduct(productid,products);
		
	}

	@DeleteMapping("/products/{productid}")
	public void deleteProduct(@PathVariable int productid) {
		service.deleteProduct(productid);
		
	}
	
	 @Autowired
		private RestTemplate restTemplate;	
		
		@SuppressWarnings("unchecked")
		
		//GET – Consumes REST API’s GET mapping response and returns domain object.
		@GetMapping("/seller/orders")
		public List<Orders> getOrders(){
			
			List<Orders> orders = null;
			
			//specify url from where u want to get the data or to use
			String url = "http://localhost:8998/buy/orders";
			
			try {
				orders =restTemplate.getForObject(url,List.class);// we get the orders data from other api as list.
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			return orders;
		}
		
		@SuppressWarnings("unchecked")
		@GetMapping("/seller/orders/{productid}")
		public List<Orders>  getOrderByProductid(@PathVariable String productid ){
			List<Orders> orders = null;
			
			String url = "http://localhost:8998/buy/orders/"+productid;
			
			try {
				orders =restTemplate.getForObject(url,List.class);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			return orders;
		}
		
		@SuppressWarnings("unchecked")
		@GetMapping("/seller/payment")
		public List<Payment> getPayments(){    
	        List<Payment> pay= null;
			
			String url = "http://localhost:8080/pay/payment";
			
			try {
				pay =restTemplate.getForObject(url,List.class);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			return pay;
		}
		
		@SuppressWarnings("unchecked")
		@GetMapping("/seller/getallratings")
		public List<Rating> getRatings(){    
			 List<Rating> rating = null;
			
			String url = "http://localhost:8060/ratings/getallratings";
			
			try {
				rating =restTemplate.getForObject(url,List.class);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			 return rating;
		}
		
	

	       

	    
		
}
	 

