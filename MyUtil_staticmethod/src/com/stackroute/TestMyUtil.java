package com.stackroute;

public class TestMyUtil {

    public static void main(String[] args) {
        //creating object of class Myutil
        MyUtil u = new MyUtil();
	    // Display value of Dice
        System.out.println("Dice value: "+u.throwDice());

        //Average of arrays
	    int num1[] = { 11,12,13,14,15};
	    int num2[]= {12,14,17,18,19};
	    System.out.println("Average of Array 1: "+u.findAverage(num1));
	    System.out.println("Average of Array 2: "+u.findAverage(num2));

	    // Find max and min values of 2 doubles
	    double doub1 =123.123;
	    double doub2 = 542.1245;
	    System.out.println("\nThe maximum of the 2 double is:"+(Math.max(doub1,doub2)));
	    System.out.println("The minimum of the 2 double is:"+(Math.min(doub1,doub2)));

	    // Finding Ceiling, Floor, Round value of a number
	    double doub3 = 1235.21;
	    System.out.println("\nThe Ceiling value of 1235.21 is:"+ Math.ceil(doub3));
	    System.out.println("The Floor value of 1235.21 is:"+ Math.floor(doub3));
	    System.out.println("The Round value of 1235.21 is:"+ Math.round(doub3));



    }
}
