package com.myapp.collections;

import java.util.List;

import com.myapp.core.Flight;

public interface FlightDao {

	void save(Flight flight);
	List<Flight> finadall();
	List<Flight>seach(String source_city,String dest_city);
	
}
