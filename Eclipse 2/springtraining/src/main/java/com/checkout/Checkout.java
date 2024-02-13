package com.checkout;

import java.util.*;
public class Checkout {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the payment option\n1.UPI\n2.Debit card\n3.Credit card");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			upi();
			break;
		case 2:
			debit();
			break;
		case 3:
			credit();
			break;
		}
	}
	static void upi() {
		CheckoutConsole a=new Upi();
		CheckoutManager upi1=new CheckoutManager(a);
		upi1.run();
	}
	
	static void debit() {
		CheckoutConsole b=new DebitCard();
		CheckoutManager deb=new CheckoutManager(b);
		deb.run();
	}
	static void credit() {
		CheckoutConsole c=new CreditCard();
		CheckoutManager cred=new CheckoutManager(c);
		cred.run();
	}
}
