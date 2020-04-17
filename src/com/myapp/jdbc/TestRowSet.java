package com.myapp.jdbc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

import com.myapp.core.FlightComponent;

public class TestRowSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
	     Scanner scanner= new Scanner(System.in);
	     String sourceCity = scanner.nextLine();//waits for user input
	     String destcity = scanner.nextLine();
		FlightComponent component= new FlightComponent();
		try (CachedRowSet rowset=component.seach(sourceCity,destcity))
{
			try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("flights.obj"))){
				oos.writeObject(rowset);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
			
		 catch (Exception e) {
			// TODO: handle exception
		}
		scanner.close();

	}
}


