package com.emtalent.marketplace.domain;

import java.util.List;
import java.util.Date;

public class Order {
	
private long id;
private List<OrderItem> orderItems;
private long customerId;
private Date orderDate;


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public List<OrderItem> getOrderItems() {
	return orderItems;
}
public void setOrderItems(List<OrderItem> orderItems) {
	this.orderItems = orderItems;
}
public long getCustomerId() {
	return customerId;
}
public void setCustomerId(long customerId) {
	this.customerId = customerId;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}


}
