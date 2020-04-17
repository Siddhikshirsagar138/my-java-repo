package com.myapp.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.myapp.core.Order;

public class ObjectDeserializtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Order> list1 = new ArrayList<>(); //<> used as implicit so we don't need to declare oder on both side
		list1.add(new Order(2,"Order2",8966.4));
		list1.add(new Order(4,"Order4",4966.4));
		list1.add(new Order(6,"Order3",3966.4));
		list1.add(new Order(8,"Order1",5966.4));
		
		try(ObjectInputStream ois=
	    new ObjectInputStream(new FileInputStream("tmp.obj"))){
	    	System.out.println(ois.readObject());
	    	}catch(IOException | ClassNotFoundException e) {
	    		e.printStackTrace();
	    	}
	}

}
