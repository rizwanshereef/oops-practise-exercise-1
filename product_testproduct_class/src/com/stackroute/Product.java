package com.stackroute;
//create class Product
public class Product {
    String productCode= "P101";
    String productName= "Laptop";
    double productPrice = 45000.00;
    Product(String productCode,String productName, double productPrice )
    {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        System.out.println("product Code:"+productCode);
        System.out.println("product Name:"+productName);
        System.out.println("product price:"+productPrice);
    }
// Creating constructor for non-reference
    public Product() {

    }
}
