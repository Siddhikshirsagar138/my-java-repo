package com.myapp.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.myapp.core.Order;

public class TestSetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Order> list1 = new ArrayList<>(); //<> used as implicit so we don't need to declare oder on both side
		list1.add(new Order(2,"Order2",8966.4));
		list1.add(new Order(4,"Order4",4966.4));
		list1.add(new Order(6,"Order3",3966.4));
		list1.add(new Order(8,"Order1",5966.4));
		list1.add(new Order(8,"Order1",5966.4));
		
		System.out.println("List Size"+list1.size());//here we have to use the equals method because it check for references and gives the duplicates
		
		//Set <Order> set = new HashSet<>();
		
		//set.addAll(list1);
		
		//System.out.println("Set Size"+set.size());
		//Set <Order> set = new TreeSet<>();
		//Set <Order> set = new TreeSet<>((o1,o2)->o1.getName().compareTo(o2.getName()));//ascending order
		Set <Order> set = new TreeSet<>((o1,o2)->o2.getName().compareTo(o1.getName()));//descending order
		
		//we have to define a sorting technique so we have to use comparable or comparator which we defined in order.java
		set.addAll(list1);
		System.out.println("Set Size"+set.size());
		
		set.forEach(System.out::println);
		

	}

}
