package com.programmingtechie.inventoryservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_inventory")
public class Inventory
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id")
	@SequenceGenerator(name="id", sequenceName="inventory_seq", allocationSize=1,initialValue=1)
	private Long id;
	private String skuCode;
	private Integer quantity;
	
	public Inventory() {
		super();
	}

	public Inventory(Long id, String skuCode, Integer quantity) {
		super();
		this.id = id;
		this.skuCode = skuCode;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", skuCode=" + skuCode + ", quantity=" + quantity + "]";
	}
	

}
