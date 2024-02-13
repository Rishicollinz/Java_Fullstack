
package com.checkout;

import java.util.*;
public class Upi implements CheckoutConsole{
	int upiid=0;
	public void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the upi id:");
		upiid=sc.nextInt();
	}
	public void print() {
		System.out.println(upiid);
	}
	
}
