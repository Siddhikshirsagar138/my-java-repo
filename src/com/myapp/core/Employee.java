package com.myapp.core;

public class Employee extends Person {

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	private class HealthMonitor implements HealthCheckup{
		public void checkUp() {
			for(int i=0;i<10;i++)
			{
				System.out.println("checking health"+getName());
			}
		}
	}
	public void checkHealth()//inner class
	{
		super.checkHealth(new HealthMonitor());
	}
}
