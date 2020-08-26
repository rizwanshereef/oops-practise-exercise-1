package com.stackroute;

public class Product {
    private String productCode;
    private String productName;
    private double productPrice;
    private char categoryCode;

    private static int num= 100;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public char getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(char categoryCode) {
        this.categoryCode = categoryCode;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Product.num = num;
    }
}
