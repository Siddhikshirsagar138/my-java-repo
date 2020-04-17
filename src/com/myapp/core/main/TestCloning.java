package com.myapp.core.main;

import com.myapp.core.Order;
import com.myapp.core.Rating;
public class TestCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating order object
		Order order = new Order(1,"nitin",56777.5);
		order.setRating(new Rating(1,4.5));
		
        try {//use quick fix try catch
        	Order order2=order.clone();
        	
        	//created cloning of order object shell-o-copy becuz order does not have any other object
        	System.out.println(order==order2);
        	
        	order2.getRating().setRating(1.0);
        	System.out.println("Order1 Rating"+order.getRating());
        	System.out.println("Order2 Rating"+order2.getRating());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
