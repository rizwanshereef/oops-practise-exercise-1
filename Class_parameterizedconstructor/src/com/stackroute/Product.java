package com.stackroute;

public class Product {
    //Initializing instance variable
    private String productCode;
    private String productName;
    private double productPrice;

    // Creating parameterized constructor
    public Product(String productCode, String productName, double productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    //Create method to display details without any return type

    void displayProductDetails()
    {
        System.out.println("Product Code:"+productCode);
        System.out.println("Product Name:"+productName);
        System.out.println("Product Price:"+productPrice);

    }
}
