package com.myapp.core;

public abstract class Shape {
	
	private double width,height;
	
	public Shape(double width, double height) {
		
		this.width=width;
		this.height=height;
		
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public abstract double calculateArea();
}
