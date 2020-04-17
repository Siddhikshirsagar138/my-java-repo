package com.myapp.core;

public abstract class Person {
	private int id;
	private String name;
	private HealthStatus status;


public Person() {
	
}
public Person(int id, String name) {//right click choose source generate Constructor
	this.id = id;
	this.name = name;
}
public int getId() {//getters and setters
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public HealthStatus getStatus() {
	return status;
}
public void setStatus(HealthStatus status) {
	this.status = status;
}
public void checkHealth(HealthCheckup checkup) {
	if(status==HealthStatus.BAD) {
		checkup.checkUp();
	
	}
	else {
		System.out.println("you are health"+name);
	}
	
}
}