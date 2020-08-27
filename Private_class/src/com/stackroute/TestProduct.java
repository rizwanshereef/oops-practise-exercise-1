package com.stackroute;

public class TestProduct {

	public static void main(String[] args) {
		// Creating 1st object with 3 parameterized constructor
		Product product1 = new Product("Desktop", 35000, 'F');
		System.out.println("The output of 1st Object is:"+product1.getProductDetails());

		// Creating 2nd object with 2 parameterized constructor
		Product product2 = new Product("Smartphone", 20000);
		System.out.println("The output of 2nd Object is:"+product2.getProductDetails());

	}
}
