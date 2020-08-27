package com.stackroute;

public class TestProduct {

    public static void main(String[] args) {

        Product product1 = new Product();
        //assigning variables using setter
        product1.setProductCode("P101");
        product1.setProductName("Laptop");
        product1.setProductPrice(45000.00);
        //Display values using getter
        System.out.println("Product Code:"+product1.getProductCode());
        System.out.println("Product Name:"+product1.getProductName());
        System.out.println("Product Price:"+product1.getProductPrice());


    }
}
