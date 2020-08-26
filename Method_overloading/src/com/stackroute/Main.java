package com.stackroute;

public class Main {

    public static void main(String[] args) {
        Average av = new Average();
        System.out.println("Method Overloading 2 integer:"+av.avg(23,25));
        System.out.println("Method Overloading 3 integer:"+av.avg(21,25,30));
        System.out.println("Method Overloading 2 double:"+av.avg(23.5,21.8));

    }
}
