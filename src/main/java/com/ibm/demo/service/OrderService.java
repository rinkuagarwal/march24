package com.ibm.demo.service;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.order;

@Service
public class OrderService {
public String createOrder(order orders) {
	return "order created";
}
}
