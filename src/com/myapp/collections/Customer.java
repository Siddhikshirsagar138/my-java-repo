package com.myapp.collections;

public class Customer {
	private final String name;//when we use final we cant modify values
	
	public static final Customer TOM= new Customer("Tom");
	public static final Customer DICK= new Customer("Dick");
	public static final Customer HARY= new Customer("Hary");
	
	

	public Customer(String name) {
		this.name = name;
	}
	
	public void reply(final String message) {
		System.out.printf("%s: %s\n" ,name,message);
		
	}

	@Override
	public String toString() {//to retrun values in map
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	

}
