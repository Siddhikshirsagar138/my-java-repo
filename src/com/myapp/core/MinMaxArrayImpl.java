package com.myapp.core;

import java.util.Arrays;

public class MinMaxArrayImpl<T> implements MinMaxArrayIntf<T> {
	private T vals[];// int array
	
public MinMaxArrayImpl(T vals[]) {
		this.vals = vals; //
	}

	@Override
	public T min() {
		// TODO Auto-generated method stub
		Arrays.sort(vals);
		return vals[0];
	}

	@Override
	public T max() {
		// TODO Auto-generated method stub
		Arrays.sort(vals);
		return vals[vals.length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer integerArray[]= {10,56,34,22};
		MinMaxArrayIntf<Integer> intArray = new MinMaxArrayImpl<>(integerArray);
		//<> symbol is used int
		
		System.out.println(intArray.min());
		System.out.println(intArray.max());
		
		Double doubleArray[]= {10.5,56.4,34.3,22.6};
		MinMaxArrayIntf<Double> dbArray = new MinMaxArrayImpl<>(doubleArray);
		
		System.out.println(dbArray.min());
		System.out.println(dbArray.max());

	}

}
