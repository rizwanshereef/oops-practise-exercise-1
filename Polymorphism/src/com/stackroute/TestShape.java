package com.stackroute;
// Creating main function TestShape
public class TestShape {

    public static void main(String[] args) {
    	// Testing Polymorphism
    	Shape shp;

		shp= new Shape();
		shp.draw();
		shp.erase();

		shp = new Circle();
		shp.draw();
		shp.erase();

		shp = new Shape();
		shp.draw();
		shp.erase();

		shp= new Square();
		shp.draw();
		shp.erase();
    }
}
