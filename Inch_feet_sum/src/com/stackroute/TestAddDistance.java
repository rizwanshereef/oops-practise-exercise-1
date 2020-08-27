package com.stackroute;

import java.util.Scanner;

public class TestAddDistance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Input values.*/
        System.out.println("Enter the distance in Inch");
        int inch = scan.nextInt();
        System.out.println("Enter the distance in Feet");
        int feet = scan.nextInt();

        /* Creating object of AddDistance. */
        AddDistance add = new AddDistance(inch,feet);

    }
}
