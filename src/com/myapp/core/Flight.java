package com.myapp.core;

public  class Flight implements Comparable<Flight>{
	 private int flight_no;
	 private String source_city;
	 private String Dest_city;
	 private double fare;
	 private String duration;

public Flight() {
	
}

public Flight(int flight_no, String source_city, String dest_city, double fare, String duration) {
	super();
	this.flight_no = flight_no;
	this.source_city = source_city;
	Dest_city = dest_city;
	this.fare = fare;
	this.duration = duration;
}

public int getFlight_no() {
	return flight_no;
}

public void setFlight_no(int flight_no) {
	this.flight_no = flight_no;
}

public String getSource_city() {
	return source_city;
}

public void setSource_city(String source_city) {
	this.source_city = source_city;
}

public String getDest_city() {
	return Dest_city;
}

public void setDest_city(String dest_city) {
	Dest_city = dest_city;
}

public double getFare() {
	return fare;
}

public void setFare(double fare) {
	this.fare = fare;
}

public String getDuration() {
	return duration;
}

public void setDuration(String duration) {
	this.duration = duration;
}

@Override
public String toString() {
	return "Flight [flight_no="+flight_no + ",source_city="+ source_city +",Dest_city=" + Dest_city +"fare=" + fare
			+"duration="+ duration +" ]";
}

public int compareTo(Flight fare) {
	if(this.getFare()>fare.getFare())
		return 1;
	else
		return -1;
}

public static Object stream() {
	// TODO Auto-generated method stub
	return null;
}


}