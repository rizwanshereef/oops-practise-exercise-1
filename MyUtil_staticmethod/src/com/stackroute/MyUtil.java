package com.stackroute;

import java.util.Random;
// Creating class MyUtil
public class MyUtil {
    // creating static method with int return value and using random method to generate values
    static int throwDice()
    {
        Random r = new Random();
        return r.nextInt(6)+1;
    }

    // creating method to find average with return value float.
    static float findAverage(int[] num)
    {
        int n = num.length;
        int sum = 0;
        for(int i =0; i<n;i++)
        {
            sum = sum +num[i];
        }
        float avg = (float)sum/n;
        return avg;
    }
}
