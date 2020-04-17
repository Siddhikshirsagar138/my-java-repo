package com.myapp.core;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlightSearch  {
	
public static void main(String args[]) {
		
		List<Flight> flight = new ArrayList();
	
	     flight.add(new Flight(11,"chennai","hyderabad",1700,"3h"));
	     flight.add(new Flight(12,"chennai","banglore",1800,"3h"));
	     flight.add(new Flight(13,"chennai","mumbai",1900,"3h"));
	     flight.add(new Flight(14,"hyderabad","pune",1200,"3h"));
	     flight.add(new Flight(15,"chennai","pune",1500,"3h"));
	     flight.add(new Flight(16,"banglore","hyderabad",1000,"3h"));
	     flight.add(new Flight(17,"pune","hyderabad",1700,"3h"));
	     flight.add(new Flight(18,"pune","hyderabad",1500,"4h"));
	     flight.add(new Flight(19,"pune","hyderabad",1800,"5h"));
           
   /*     Collections.sort(flight);
        for (Flight i:flight) {
        	System.out.println(i);
        }*/
         
     Scanner scan= new Scanner(System.in);
     System.out.println("Enter the source city \n 1.chennai \n 2.hyderabad \n 3.banglore \n 4.pune");
     String x = scan.nextLine();//waits for user input
     Scanner scan1= new Scanner(System.in);
     System.out.println("Enter the destination city \n 1.mumbai \n 2.hyderabad \n 3.banglore \n 4.pune");
     String y = scan.nextLine();
     
    // Comparator<Flight> cmp2 =(f1,f2)->
     //((Double)f1.getFare()).compareTo(f2.getFare());
     
     flight.stream().filter(f->f.getSource_city().equalsIgnoreCase(x)&&f.getDest_city().equalsIgnoreCase(y))
     .sorted((f1,f2) -> f1.compareTo(f2)).forEach(System.out::println);
         
         
     /*if (x.length () == y.length())
     {
    	 System.out.println(flight.get(0));
     }
   
     if (x.length () < y.length())
     {
    	 System.out.println(flight.get(1));
     }
     if (x.length () > y.length())
     {
    	 System.out.println(flight.get(2));
     } 	
     */
	}
	

}
