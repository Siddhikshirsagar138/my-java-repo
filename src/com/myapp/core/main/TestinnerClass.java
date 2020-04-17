package com.myapp.core.main;

import com.myapp.core.Employee;
import com.myapp.core.HealthCheckup;
import com.myapp.core.HealthStatus;

public class TestinnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1,"Name1");
		emp.setStatus(HealthStatus.BAD);
	//	emp.checkHealth();
		emp.checkHealth(new HealthCheckup(){//anonymous inner class passing class itself as parameter to function
			public void checkUp() {
				for(int i=0;i<=5;i++)
				{
					System.out.println("Checking health"+emp.getName());
				}
			}
		});
	}
}
