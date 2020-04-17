package com.myapp.core;
import java.util.Arrays;

public class MinMaxArrayImpl2<T extends Comparable<T>>//<T extends Comparable<T> T is bound to comparable T is comparable
implements MinMaxArrayIntf<T> {
	private T vals[];// int array
	
public MinMaxArrayImpl2(T vals[]) {
		this.vals = vals; //
	}

	@Override
	public T min() {
		// TODO Auto-generated method stub
		T v= vals[0];
	//	for(int val=0;val<vals.length;val++)
	//	{
	//		}
		for(T val: vals) {
			if(val.compareTo(v)<0) {
				v=val;
			}			
		}
		return v;
	}

	@Override
	public T max() {
		// TODO Auto-generated method stub
		T v= vals[0];
		//	for(int val=0;val<vals.length;val++)
		//	{
		//		}
			for(T val: vals) {
				if(val.compareTo(v)>0) {
					v=val;
				}			
			}
			return v;
			
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer integerArray[]= {10,56,34,22};
		MinMaxArrayIntf<Integer> intArray = new MinMaxArrayImpl2<>(integerArray);
		//<> symbol is used int
		
		System.out.println(intArray.min());
		System.out.println(intArray.max());
		
		Double doubleArray[]= {10.5,56.4,34.3,22.6};
		MinMaxArrayIntf<Double> dbArray = new MinMaxArrayImpl2<>(doubleArray);
		
		System.out.println(dbArray.min());
		System.out.println(dbArray.max());
	
	Order orders[]= {new Order(1,"name1",5678.7),
			new Order(4,"name4",8888.3),
			new Order(6,"name6",2488.3),
			new Order(3,"name3",1288.3),
	};
	MinMaxArrayIntf<Order> ordersArray = new MinMaxArrayImpl2<>(orders);

	System.out.println(ordersArray.min());
	System.out.println(ordersArray.max());

}
	
}
