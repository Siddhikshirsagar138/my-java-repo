package com.myapp.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Enquiry> map= new HashMap<>();//PUT IS LIKE ADD ONLY FOR MAP WE USE PUT
		map.put(1,new Enquiry(Customer.DICK,Category.COMPUTER));
		map.put(3,new Enquiry(Customer.HARY,Category.PRINTER));
		map.put(2,new Enquiry(Customer.TOM,Category.TABLET));
		System.out.println(map.get(2));//for map get method takes parameter key not index
		System.out.println(map.remove(3));
		map.keySet().stream().forEach(System.out::println);
		map.entrySet().stream().forEach(System.out::println);
				
	}

}
