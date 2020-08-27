package com.stackroute;

import java.util.Random;
// Creating class MyUtil
public class MyUtil {
    // creating static method with int return value and using random method to generate values
    static int throwDice()
    {
        Random ran = new Random();
        return ran.nextInt(6)+1;
    }

    // creating method to find average with return value float.
    static float findAverage(int[] num)
    {
        int len = num.length;
        int sum = 0;
        for(int i =0; i<len;i++)
        {
            sum = sum +num[i];
        }
        float avg = (float)sum/len;
        return avg;
    }
}
