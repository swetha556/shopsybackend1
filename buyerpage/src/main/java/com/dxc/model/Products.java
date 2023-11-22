package com.dxc.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


public class Products {
 
	private int productid;
    private String brandname;
	private String productname;
	private String specification;
	private double buyingprice;
	

	
	public Products() {
		super();
	}

	public Products(int productid,String brandname, String productname, String specification,double buyingprice) {
		super();
		this.productid = productid;
		this.brandname=brandname;
		this.productname = productname;
		this.specification=specification;
		this.buyingprice = buyingprice;
	}

	public int getProductId() {
		return productid;
	}

	public void setProductId(int productid) {
		this.productid= productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String pname) {
		this.productname = pname;
	}

	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname= brandname;
	}
	
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification= specification;
	}
	
	public double Buyingprice() {
		return buyingprice;
	}
	public void setBuyingprice(double buyingprice) {
		this.buyingprice = buyingprice;
	}
	
	@Override
	public String toString() {
		return "Products [productid=" + productid + ", brandname="+brandname+",productname=" + productname +  ", specification=" + specification+ ",buyingprice=" + buyingprice+"]";
	}
	
}
