package com.checkout;

public class CheckoutManager implements CheckoutConsole{
	CheckoutConsole gt;
	public CheckoutManager(CheckoutConsole w){
		gt=w;
	}
	void run() {
		gt.get();
		gt.print();
	}
}
