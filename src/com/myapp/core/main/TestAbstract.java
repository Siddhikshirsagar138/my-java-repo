package com.myapp.core.main;

import com.myapp.core.Shape;
import com.myapp.core.Traingle;
import com.myapp.core.Rectangle;

public class TestAbstract {
	
	public static void display(Shape shape) {
		
		System.out.println("Area of " 
		+ shape.getClass().getSimpleName() +shape.calculateArea());
		//get class go to class and recognize class and simple name gives name of class
		//runtime identification
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle(23.4, 34.5);
		Shape traingle = new Traingle(23.4, 34.5);
		
		TestAbstract.display(rectangle);
		TestAbstract.display(traingle);
		
	}
}
