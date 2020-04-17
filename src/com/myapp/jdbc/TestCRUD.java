package com.myapp.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import com.myapp.collections.FlightDAOImpl;
import com.myapp.collections.FlightDao;
import com.myapp.core.Flight;

public class TestCRUD {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		try {
			FlightDao dao= new FlightDAOImpl(DbConnection.getConnection());
			dao.save(new Flight(1234,"bengluru","mumbai",1200,"2h"));
			dao.save(new Flight(1235,"bengluru","pune",1000,"1h"));
			
		} catch (SQLException e) {
		// TODO: handle exception
			e.printStackTrace();
		}
	     
	
	}
	         

	}
