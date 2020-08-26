package com.stackroute;

public class Product {
    // Creating private instance variable.
    private String productCode;
    private String productName;
    private double productPrice;
    private char categoryCode;
// Creating private static integer with value initialized 100
    private static int num= 100;

    // Creating getter and setter
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


    // Method to generate the Product code as String which will merge Catogery Code and Incremented product counter
    private String generateProductCode()
    {
        num++;
        return (Character.toString(categoryCode)+Integer.toString(num));
    }

    // Initializing constructor of 3 parameter
    public Product(String productName, double productPrice, char categoryCode) {
        // Initialize variables
        this.productCode = "P101";
        this.productName = "Laptop";
        this.productPrice = 45000;
        this.categoryCode = 'F';

        this.productName = productName;
        this.productPrice = productPrice;
        this.categoryCode = categoryCode;
        this.productCode = generateProductCode();

    }
    // Initializing constructor of 2 parameter
    public Product(String productName, double productPrice) {
        //Initializing variables
        this.productCode = "P101";
        this.productName = "Laptop";
        this.productPrice = 45000;
        this.categoryCode ='E';

        this.productName = productName;
        this.productPrice = productPrice;
        this.productCode = generateProductCode();
    }

    // method to format output in string format of String return type
    public String getProductDetails(){
        String con = ("Code-"+productCode+", Name-"+productName+",price-"+Double.toString(productPrice)+", Category-"+Character.toString(categoryCode));
        return con;
    }
}
