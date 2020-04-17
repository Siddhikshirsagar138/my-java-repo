package com.myapp.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorExample {
	int OrderID;
	int customerID;
	float cost;
	String name;
	
	IteratorExample(int oi,int ci,float c,String n)
	{
		OrderID=oi;
		customerID=ci;
		cost=c;
		name=n;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IteratorExample I1=new IteratorExample(1,201,2500,"book");
		IteratorExample I2=new IteratorExample(2,202,12500,"phone");
		IteratorExample I3=new IteratorExample(3,203,5500,"laptop");
		IteratorExample I4=new IteratorExample(4,204,3500,"shoe");
		LinkedHashSet v= new LinkedHashSet();
		v.add(I1);
		v.add(I2);
		v.add(I3);
		v.add(I4);
		Iterator itr=v.iterator();
		while(itr.hasNext()) {
			IteratorExample a=(IteratorExample)itr.next();
			System.out.println(a.name+" "+a.cost);
		}
		
		
		
	}

}
