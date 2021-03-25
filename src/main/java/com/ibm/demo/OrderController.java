package com.ibm.demo;

import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.entity.Order;
import com.ibm.demo.service.OrderService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
@RestController
public class OrderController {//frontend
	@Autowired
	OrderService orderService;//DI
            @PostMapping("/order")
            @ResponseStatus(code = HttpStatus.CREATED)
            String createOrder(@RequestBody@Valid Order order, BindingResult bindingResult) {
            	validateModel(bindingResult);
            	System.out.println(order);
	             return orderService.createOrder(order);
}
            @GetMapping("/order/{id}")
            Order getOrder(@PathVariable("id") int orderId) {
            	return orderService.getOrder(orderId);
            }
            @GetMapping("/order}")
            List<Order> getOrders() {
            	return orderService.getOrders();
            }
            
            //DRY
            private void validateModel(Errors bindingResult) {
            	if(bindingResult.hasErrors()) {
             		throw new IllegalArgumentException("something went wrong, please try again");
             	}
            }
         @PutMapping("/order/{id}")
         void updateOrder(@RequestBody@Valid Order order, @PathVariable("id") int orderId, BindingResult bindingResult){
        	 validateModel(bindingResult);
        	 System.out.println(orderId);
        	 orderService.updateOrder(orderId);
         }
         @DeleteMapping("/order/{id}")
         void deleteOrder(@PathVariable("id") int orderId) {
        	 System.out.println(orderId);
        	 orderService.deleteOrder();
         }
}
