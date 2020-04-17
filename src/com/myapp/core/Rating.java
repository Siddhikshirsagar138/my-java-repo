package com.myapp.core;

public class Rating implements Cloneable{
	private int id;
	private double rating;
	
public Rating(){
	
}
public Rating(int id, double rating) {
	super();
	this.id = id;
	this.rating = rating;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Rating [id=");
	builder.append(id);
	builder.append(", rating=");
	builder.append(rating);
	builder.append("]");
	return builder.toString();
}
protected Rating clone() throws CloneNotSupportedException{
	return (Rating)super.clone();
}
	
}