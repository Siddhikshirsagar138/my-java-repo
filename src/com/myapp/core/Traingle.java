package com.myapp.core;

public class Traingle extends Shape {

	public Traingle(double width, double height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return .5*getWidth()*getHeight();
	}
}


