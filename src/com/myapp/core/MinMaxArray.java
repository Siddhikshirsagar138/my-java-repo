package com.myapp.core;
import java.util.Arrays;

public class MinMaxArray {	
	
	public static void min(int[] array) {
		Arrays.sort(array);
		System.out.println(array[0]);
	}

	public static void max(int[] array) {
		Arrays.sort(array);
		System.out.println(array[array.length-1]);
	}
	public static void min(double[] array) {
		Arrays.sort(array);
		System.out.println(array[0]);
	}

	public static void max(double[] array) {
		Arrays.sort(array);
		System.out.println(array[array.length-1]);
	}
	public static void min(char[] array) {
		Arrays.sort(array);
		System.out.println(array[0]);
		//System.out.println(array[array.length-1]);
	}

	public static void max(char[] array) {
		Arrays.sort(array);
		System.out.println(array[array.length-1]);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray[]= {45,78,99,100};
		min(intArray);
		max(intArray);
		
		double doubleArray[]= {4.5,7.8,9.9,10.9};
		min(doubleArray);
		max(doubleArray);
				
		char charArray[]= {'a','b','c','d'};
		min(charArray);
		max(charArray);
	       	
	}


}
