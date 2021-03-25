package com.ibm.demo;

import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.entity.order;
import com.ibm.demo.service.OrderService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class OrderController {//frontend
	@Autowired
	OrderService orderService;//DI
            @PostMapping("/order")
            String createOrder(@RequestBody@Valid order orders, BindingResult bindingResult) {
            	if(bindingResult.hasErrors()) {
            		throw new IllegalArgumentException("something went wrong");
            	}
            	System.out.println(orders);
	             return orderService.createOrder(orders);
}
            @GetMapping("/order")
            String getOrder() {
            	return "order created";
            }
         @PutMapping("/order/{id}")
         String updateOrder(@PathVariable("id") int orderId){
        	 System.out.println(orderId);
        	 return "order updated";
         }
         @DeleteMapping("/order/{id}")
         String deleteOrder(@PathVariable("id") int orderId) {
        	 System.out.println(orderId);
        	 return "order delete";
         }
}
