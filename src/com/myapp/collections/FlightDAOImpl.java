package com.myapp.collections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myapp.core.Flight;
import com.mysql.jdbc.Statement;

public class FlightDAOImpl implements FlightDao{

private Connection connection;

public FlightDAOImpl(Connection connection) {
this.connection = connection;
}

@Override
public void save(Flight flight) {
	// TODO Auto-generated method stub
	String sql ="insert into flights values(?,?,?,?,?)";

	try (PreparedStatement ps= connection.prepareStatement(sql)){

	ps.setInt(1, flight.getFlight_no());
	ps.setString(2,flight.getSource_city());
	ps.setString(3, flight.getDest_city());
	ps.setDouble(4, flight.getFare());
	ps.setString(5, flight.getDuration());

	int count= ps.executeUpdate();
	System.out.println("New Flight Inserted Sucesfully "+count);


	} catch (SQLException e) {
	e.printStackTrace();
	}

	}

	

@Override
public List<Flight> finadall() {
	// TODO Auto-generated method stub
	
	String sql="select * from flights";
	List<Flight>list=new ArrayList<>();
	try (Statement statement =(Statement) connection.createStatement())
    {
		ResultSet rs=statement.executeQuery(sql);
        while(rs.next()) {
    	list.add(new Flight(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5)));
    }
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	return list;
}

@Override
public List<Flight> seach(String source_city, String dest_city) {
	// TODO Auto-generated method stub
	String sql="select * from flights where source_city=?"+"and dest_city=?";
	List<Flight>list=new ArrayList<>();
	try (PreparedStatement statement = connection.prepareStatement(sql))
    {
		statement.setString(1, source_city);
		statement.setString(1, dest_city);
		ResultSet rs=statement.executeQuery(sql);
        while(rs.next()) {
    	list.add(new Flight(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5)));
    }
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	return list;

}


}
