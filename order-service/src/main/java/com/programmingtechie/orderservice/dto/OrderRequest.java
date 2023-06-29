package com.programmingtechie.orderservice.dto;

import java.util.List;

public class OrderRequest 
{
	private List<OrderLineItemsDto> orderLineItemDtoList;

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderRequest(List<OrderLineItemsDto> orderLineItemDtoList) {
		super();
		this.orderLineItemDtoList = orderLineItemDtoList;
	}

	public List<OrderLineItemsDto> getOrderLineItemDtoList() {
		return orderLineItemDtoList;
	}

	public void setOrderLineItemDtoList(List<OrderLineItemsDto> orderLineItemDtoList) {
		this.orderLineItemDtoList = orderLineItemDtoList;
	}
	
	

}
