package com.programmingtechie.orderservice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_orders")
public class Order 
{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id")
	@SequenceGenerator(name="id", sequenceName="order_seq", allocationSize=1,initialValue=1)
	private Long id;
	private String orderNumber;
	@OneToMany(cascade = CascadeType.ALL)
	private List<OrderLineItems> orderLineItemsList;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Long id, String orderNumber, List<OrderLineItems> orderLineItemsList) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.orderLineItemsList = orderLineItemsList;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public List<OrderLineItems> getOrderLineItemsList() {
		return orderLineItemsList;
	}
	public void setOrderLineItemsList(List<OrderLineItems> orderLineItemsList) {
		this.orderLineItemsList = orderLineItemsList;
	}
	
	
}
