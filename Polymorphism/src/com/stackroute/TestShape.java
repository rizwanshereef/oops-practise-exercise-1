package com.stackroute;
// Creating main function TestShape
public class TestShape {

    public static void main(String[] args) {
    	// Testing Polymorphism
    	Shape s;

		s= new Shape();
		s.draw();
		s.erase();

		s = new Circle();
		s.draw();
		s.erase();

		s = new Shape();
		s.draw();
		s.erase();

		s= new Square();
		s.draw();
		s.erase();
    }
}
