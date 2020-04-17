package com.myapp.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.myapp.core.Order;

public class TestListInterfaceLambdaAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Order> list1 = new ArrayList<>(); //<> used as implicit so we don't need to declare oder on both side
		list1.add(new Order(2,"Order2",8966.4));
		list1.add(new Order(4,"Order4",4966.4));
		list1.add(new Order(6,"Order3",3966.4));
		list1.add(new Order(8,"Order1",5966.4));
		
		//System.out.println(list1.stream().mapToDouble(o->o.getPrice()).average().getAsDouble());
		//mapToDouble gets only the price and create a new list of price and we can average it
		Comparator<Order> cmp2 =(o1,o2)->
	       ((Double)o1.getPrice()).compareTo(o2.getPrice());
	      
	       //with sorting
	       list1.stream().filter((Order o)->o.getPrice()>5000);//.sorted(cmp2)//using functional programming
			//.collect(Collectors.toList()).forEach(System.out::println);//consumer
	       //System.out.println(list1.stream().mapToDouble(o->o.getPrice()).sum());
	       
	       
	       //here we are using filter as parameter 
	       System.out.println(list1.stream().filter(o->o.getPrice()>3000).mapToDouble(o->o.getPrice()).sum());
       
	}

}
