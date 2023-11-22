package com.dxc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paymentlist")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int paymentID;
	String paymentDate;
	String paymentMethod;
	
	public Payment() {
		super();
	}

	public Payment( int paymentID,String paymentMethod,String paymentDate) {
		super();
		this.paymentID=paymentID;
		this.paymentMethod = paymentMethod;
		this.paymentDate = paymentDate;
	}


	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		return "Payment [paymentDate ="+paymentDate+", paymentID="+paymentID+",paymentMethod=" + paymentMethod + "]";
	}

	
}

