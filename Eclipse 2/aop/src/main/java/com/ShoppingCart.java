package com;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	public void checkout(String a){
		System.out.println("Checkout method from shopping cart");
	}
	
	public void disp() {
		System.out.println("Display method from shopping cart");
	}
}
