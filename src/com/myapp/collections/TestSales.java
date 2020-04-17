package com.myapp.collections;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class TestSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	final List<Sales> sales = Arrays.asList(
				new Sales(Store.KANSAS_CITY, new Date(), Optional.of("Sarah"),
				Arrays.asList(
				new Item("carrot", 12.00)
				)),
				new Sales(Store.ST_LOUIS, new Date(), Optional.empty(),
				Arrays.asList(
				new Item("carrot", 12.00),
				new Item("chips", 99.99),
				new Item("cookie", 1.99)
				)),
				new Sales(Store.ST_LOUIS, new Date(), Optional.of("Jamie"),
				Arrays.asList(
				new Item("banana", 3.49),
				new Item("cookie", 1.49)
				)));
		
		System.out.println("Max sale ammont\n"+sales.stream().mapToDouble(Sales -> Sales.total()).sum());
		System.out.println("No of items\n"+sales.stream().mapToInt(Sales -> Sales.items.size()).sum());
		System.out.println("No of items\n"+sales.stream().distinct());
		//System.out.println(sales.stream().distinct());
		
		
	}
}
