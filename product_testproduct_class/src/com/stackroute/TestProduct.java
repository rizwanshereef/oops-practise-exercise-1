package com.stackroute;

public class TestProduct {
//main class TestProduct
    public static void main(String[] args) {
	Product p1 = new Product(); //initializing object of class Product
        // Display instance variable values
    System.out.println("product Code:"+p1.productCode);
    System.out.println("product Name:"+p1.productName);
    System.out.println("product price:"+p1.productPrice);
    // Initialize another object and assign values.
    Product p2 = new Product("P102", "Desktop",35000);
    }
}
