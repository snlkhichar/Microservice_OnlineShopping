package com.programming.techie.productservice.model;



import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="product")
public class Product {
	
	@Id
	private String id;
	private String name;
	private String descripation;
	private BigDecimal price;
		
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String name, String descripation, BigDecimal price) {
		super();
		this.name = name;
		this.descripation = descripation;
		this.price = price;
	}

	

	public Product(String id, String name, String descripation, BigDecimal price) {
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
