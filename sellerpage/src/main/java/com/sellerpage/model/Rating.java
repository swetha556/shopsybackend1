package com.sellerpage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rating")
public class Rating  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reviewId;	
	private int productId; 
	private String username;
	private float rating;
	private String comment;
	private String date;
	
	
	public Rating (int reviewId, int productId, String username, float rating, String comment, String date) {
		super();
		this.reviewId = reviewId;
		this.productId = productId;
		this.username = username;
		this.rating = rating;
		this.comment = comment;
		this.date = date;
	}
	public Rating () {
		super();
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating= rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "CustomerReview  [reviewId=" + reviewId + ", productId=" + productId + ", username=" + username + ", rating="
				+ rating + ", comment=" + comment + ", date=" + date + "]";
	}
	
	
	
}