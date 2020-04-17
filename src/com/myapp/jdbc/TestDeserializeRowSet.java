package com.myapp.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;

import com.myapp.core.Flight;

public class TestDeserializeRowSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Flight> list= new ArrayList<>();
		try (ObjectInputStream ois=
				new ObjectInputStream(new FileInputStream("flights.obj"))){
			   CachedRowSet rs=(CachedRowSet) ois.readObject();
			 while(rs.next()) {
			    	list.add(new Flight(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5)));
			    }
		}catch (IOException |ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
       list.forEach(System.out::println);
	}

}
