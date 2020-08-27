package com.stackroute;

// creating class Average.
public class Average {
    // creating method which can calculate average of 2 integer and returns average as double.
    public static double avg (int numOne, int numTwo)
    {
        int sum = numOne+ numTwo;
        double avg = (double)sum/2;
        return avg;
    }
    // creating method which can calculate average of 3 integer and returns average as double.
    public static double avg(int numOne, int numTwo, int numThree)
    {
        int sum = numOne+numTwo+numThree;
        double avg = (double)sum/3;
        return avg;
    }
    // creating method which can calculate average of 2 double and returns average as double.
    public static double avg(double dubOne, double dubTwo)
    {
        double sum = dubOne+dubTwo;
        double avg = sum/2;
        return avg;
    }
}
