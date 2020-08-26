package com.stackroute;

public class AddDistance {
    float inch;
    float feet;

    /* Creating Constructor. */
    public AddDistance(int inch, int feet) {
        this.inch = inch;
        this.feet = feet;
        //Conversion for calculating both the distance in inch
        int feet_inch = feet *12;
        int sum = inch + feet_inch;

        // Conversion for calculating distance in feet
        float inch_feet = (float)sum/12;

        /* Display result both in inch and feet */
        System.out.println("The total distance in Inch:"+sum);
        System.out.println("The total distance in Feet:"+inch_feet);

    }


}
