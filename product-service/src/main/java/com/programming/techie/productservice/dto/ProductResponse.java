package com.programming.techie.productservice.dto;

import java.math.BigDecimal;

public class ProductResponse {
	
	private String id;
	private String name;
	private String descripation;
	private BigDecimal price;
	public ProductResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductResponse(String id, String name, String descripation, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.descripation = descripation;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescripation() {
		return descripation;
	}
	public void setDescripation(String descripation) {
		this.descripation = descripation;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	

}
