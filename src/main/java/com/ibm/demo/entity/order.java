package com.ibm.demo.entity;

import javax.validation.constraints.NotNull;



public class order {
	@NotNull
private String item;
private float price;




public String getItem() {
	return item;
}

public void setItem(String item) {
	this.item = item;
}

public float getPrice() {
	
	return price;
}

public void setPrice(float price) {
	if(price<=0) {
		throw new IllegalArgumentException("price cannot be negative");
	}
	this.price = price;
}

}
