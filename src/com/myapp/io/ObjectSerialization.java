package com.myapp.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.myapp.core.Order;

public class ObjectSerialization  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Order> list1 = new ArrayList<>();    //<> used as implicit so we don't need to declare oder on both side
		
		list1.add(new Order(2,"Order2",8966.4));
		list1.add(new Order(4,"Order4",4966.4));
		list1.add(new Order(6,"Order3",3966.4));
		list1.add(new Order(8,"Order1",5966.4));
		 
		try (ObjectOutputStream oos=
		new ObjectOutputStream(new FileOutputStream("tmp.obj"))){
			
			oos.writeObject(list1);
			System.out.println("serialized");
			
	}catch(Exception e) {
		e.printStackTrace();
			
		}

	}

}
