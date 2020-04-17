package com.myapp.core;

import java.io.Serializable;

public class Order implements Comparable<Order>,Cloneable,Serializable{//Cloneable 
	private int id;
	private String name;
	private double price;
	private Rating rating;
	
	public Order() {//enter control+space we will get default constructor
		// TODO Auto-generated constructor stub
		
	}

	public Order(int id, String name, double price) {//right click choose source->generate constructors using fields
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {//right click choose source and select getters setters
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		
	}
	

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	@Override
	public int compareTo(Order o) {
			return((Double)price).compareTo(o.price);
		}
		// TODO Auto-generated method stub

	@Override
	public String toString() {//right click choose source and select Generate toString
		StringBuilder builder = new StringBuilder();
		builder.append("Order [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	//for clone() we are using throws becuz it is checked exception  
	public Order clone() throws CloneNotSupportedException{//if protected is used it will not be allowed to use in another class so make it public
		Order order= (Order)super.clone();
		
		order.setRating(getRating().clone());
		return order;
				
	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {//select source generate has code AND equals and select instance off for set becuz set uses hash map to maintain unique values
		if (this == obj)
			return true;
		if (!(obj instanceof Order))
			return false;
		Order other = (Order) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
}
	

