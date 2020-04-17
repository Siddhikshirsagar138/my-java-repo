package com.myapp.collections;//choose new create new package as collection as give name and select main method

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.myapp.core.Order;

public class ListInterface {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//List list2 = new ArrayList();//here we have to do repeated casting not recommonded
		
		List <Order> list1 = new ArrayList<>(); //<> used as implicit so we don't need to declare oder on both side
		list1.add(new Order(2,"Order2",8966.4));
		list1.add(new Order(4,"Order4",4966.4));
		list1.add(new Order(6,"Order3",3966.4));
		list1.add(new Order(8,"Order1",1966.4));
		//list1.add("");//gives error other than order nothing is allowed
		
		System.out.println("Size"+list1.size());
		System.out.println("Get"+list1.get(0));
		System.out.println("Remove"+list1.remove(1));
		System.out.println("Set"+list1.set(2,new Order(100,"Name111",1000.7)));
		
		//for(Order order : list1)
			//System.out.println(order);
		
		//for each and while does same work
		/*Iterator<Order>iterator=list1.iterator();
		while(iterator.hasNext()) {//hasNext return boolean value Next return current object and move the cursor
			System.out.println(iterator.next());
		}*/
		ListIterator<Order> iterator =list1.listIterator();//intern extends iterator we can move in both direction top to bottom or bottom to top
		while(iterator.hasNext()) {
			iterator.next();
		}
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}


}
