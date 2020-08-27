package com.stackroute;

public class TestMyUtil {

    public static void main(String[] args) {
        /*creating object of class Myutil */
        MyUtil ut = new MyUtil();
	    // Display value of Dice
        System.out.println("Dice value: "+ut.throwDice());

        /*Average of arrays */
	    int numOne[] = { 11,12,13,14,15};
	    int numTwo[]= {12,14,17,18,19};
	    System.out.println("Average of Array 1: "+ut.findAverage(numOne));
	    System.out.println("Average of Array 2: "+ut.findAverage(numTwo));

	    /* Find max and min values of 2 doubles */
	    double doubOne =123.123;
	    double doubTwo = 542.1245;
	    System.out.println("\nThe maximum of the 2 double is:"+(Math.max(doubOne,doubTwo)));
	    System.out.println("The minimum of the 2 double is:"+(Math.min(doubOne,doubTwo)));

	    /* Finding Ceiling, Floor, Round value of a number */
	    double doubThree = 1235.21;
	    System.out.println("\nThe Ceiling value of 1235.21 is:"+ Math.ceil(doubThree));
	    System.out.println("The Floor value of 1235.21 is:"+ Math.floor(doubThree));
	    System.out.println("The Round value of 1235.21 is:"+ Math.round(doubThree));



    }
}
