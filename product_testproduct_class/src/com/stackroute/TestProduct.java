package com.stackroute;

public class TestProduct {
//main class TestProduct
    public static void main(String[] args) {
	Product product1 = new Product(); //initializing object of class Product
        // Display instance variable values
    System.out.println("product Code:"+product1.productCode);
    System.out.println("product Name:"+product1.productName);
    System.out.println("product price:"+product1.productPrice);
    // Initialize another object and assign values.
    Product productTwo = new Product("P102", "Desktop",35000);
    }
}
