package com.demo.Books.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int b_id;
	private String b_name;
	private String describtion;
	private float price;
	
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getDescribtion() {
		return describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
