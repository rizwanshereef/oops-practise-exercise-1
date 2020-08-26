package com.stackroute;

public class TestProduct {

    public static void main(String[] args) {

        Product p1 = new Product();
        //assigning variables using setter
        p1.setProductCode("P101");
        p1.setProductName("Laptop");
        p1.setProductPrice(45000.00);
        //Display values using getter
        System.out.println("Product Code:"+p1.getProductCode());
        System.out.println("Product Name:"+p1.getProductName());
        System.out.println("Product Price:"+p1.getProductPrice());


    }
}
