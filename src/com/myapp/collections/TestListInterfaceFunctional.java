package com.myapp.collections;
//create new class and select main method
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.myapp.core.Order;

public class TestListInterfaceFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Order> list1 = new ArrayList<>(); //<> used as implicit so we don't need to declare oder on both side
		list1.add(new Order(2,"Order2",8966.4));
		list1.add(new Order(4,"Order4",4966.4));
		list1.add(new Order(6,"Order3",3966.4));
		list1.add(new Order(8,"Order1",5966.4));
		
		//instead here we can use lambda expression(->)	
	/*	List<Order> list2 = new ArrayList<>();
		for(Order o:list1) {
		 if(o.getPrice()>=5000) {
			 list2.add(o);
		 }
			
		}
		for(Order o:list2) {
			System.out.println(o);
		}
*/
		//list1.stream().filter((Order o)->o.getPrice()>5000)//using functional programming
		//.collect(Collectors.toList()).forEach(System.out::println);//consumer
		
		//without sorting
		//list1.stream().filter((Order o)->o.getPrice()>5000)//using functional programming
		//.collect(Collectors.toList()).forEach(o->System.out.println(o));//consumer
		
		/*List<Order> newList=
		list1.stream().filter((Order o)->o.getPrice()>5000)//using functional programming
		.collect(Collectors.toList());
		*/
		//Anonymous inner class
		/*Comparator<Order> cmp=new Comparator <Order>() {
			public int compare (Order o1,Order o2) {
				return 0;
			
		}*/
			
			// Java functional programming using lambda functions
		/*
		Comparator<Order> cmp1 =(Order o1, Order o2)->{
			return ((Double)o1.getPrice()).compareTo(o2.getPrice());
		};*/
		
			
			Comparator<Order> cmp2 =(o1,o2)->
	       ((Double)o1.getPrice()).compareTo(o2.getPrice());
	      
	       //with sorting
	       list1.stream().filter((Order o)->o.getPrice()>5000).sorted(cmp2)//using functional programming
			.collect(Collectors.toList()).forEach(System.out::println);//consumer
			
	
	
		
	}
	
}
