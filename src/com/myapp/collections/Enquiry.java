package com.myapp.collections;

public class Enquiry {
	
  private final	Customer customer;
  private final Category category;
public Enquiry(Customer customer, Category category) {//generate constructor using fields
	this.customer = customer;
	this.category = category;
}
public Customer getCustomer() { //only getters will be generated because its final datatype
	return customer;
}
public Category getCategory() {
	return category;
}
@Override
public String toString() {//generate to string
	StringBuilder builder = new StringBuilder();
	builder.append("Enquiry [customer=");
	builder.append(customer);
	builder.append(", category=");
	builder.append(category);
	builder.append("]");
	return builder.toString();
}

  
	
}
