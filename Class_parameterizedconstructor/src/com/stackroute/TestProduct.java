package com.stackroute;

public class TestProduct {

    public static void main(String[] args) {
        //creating object using parameterized constructor
	Product p1 = new Product("P101", "Laptop", 45000);
	//invoke method productDetails
	p1.displayProductDetails();
    }
}
