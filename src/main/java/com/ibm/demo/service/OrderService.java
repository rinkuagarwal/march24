package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;

@Service
public class OrderService {//spring beans
	@Autowired
	OrderRepository orderRepository;
public String createOrder(Order order) {
	Order savedOrder= orderRepository.save(order);
	return savedOrder.getId();
}

public Optional<Order> getOrder(String orderId) {
	
	return orderRepository.findById(orderId);
}
public List<Order> getOrders(){
	return orderRepository.findAll();
}

public void updateOrder(Order order) {
	orderRepository.save(order);
	
}

public void deleteOrder() {
	
	System.out.println("order deleted");
}


}
