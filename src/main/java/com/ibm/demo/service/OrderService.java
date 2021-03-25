package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service
public class OrderService {
public String createOrder(Order orders) {
	return "order created";
}

public Order getOrder(int orderId) {
	
	return new Order();
}
public List<Order> getOrders(){
	return new ArrayList<Order>();
}

public void updateOrder(int orderId) {
	
	
}

public void deleteOrder() {
	
	System.out.println("order deleted");
}


}
