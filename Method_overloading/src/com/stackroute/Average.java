package com.stackroute;

// creating class Average.
public class Average {
    // creating method which can calculate average of 2 integer and returns average as double.
    public static double avg (int num1, int num2)
    {
        int sum = num1+ num2;
        double avg = (double)sum/2;
        return avg;
    }
    // creating method which can calculate average of 3 integer and returns average as double.
    public static double avg(int num1, int num2, int num3)
    {
        int sum = num1+num2+num3;
        double avg = (double)sum/3;
        return avg;
    }
    // creating method which can calculate average of 2 double and returns average as double.
    public static double avg(double dub1, double dub2)
    {
        double sum = dub1+dub2;
        double avg = sum/2;
        return avg;
    }
}
