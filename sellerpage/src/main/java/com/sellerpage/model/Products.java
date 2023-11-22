package com.sellerpage.model;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
//this class(Products) is mapped to the table in the database. 
@Table(name="productlist")
public class Products {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// unique value set by table
    
	private int productid;  
    private String brandname;
	private String productname;
	private String specification;
	private double buyingprice;
	


	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int productid,String brandname, String productname , String specification,double buyingprice) {
		super();
		this.productid = productid;
		this.brandname=brandname;
		this.productname = productname ;
		this.specification=specification;
		this.buyingprice = buyingprice;
	}
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname= brandname;
	}
	
	public String getProductname() {
		return productname ;
	}
	public void setProductname(String productname ) {
		this.productname = productname ;
	}

	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification= specification;
	}
	
	public double getBuyingprice() {
		return buyingprice;
	}
	public void setBuyingprice(double buyingprice) {
		this.buyingprice =buyingprice ;
	}
	
	@Override
	public String toString() {
		return "Products [productid=" + productid + ", brandname="+brandname+",productname =" + productname  +  ", specification=" + specification+ ",buyingprice=" + buyingprice+"]";
	}
	
	
	
}