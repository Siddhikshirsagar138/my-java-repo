package com.myapp.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class FlightComponent {

	private Connection connection;
	public FlightComponent(Connection connection) {
		this.connection =connection;
		// TODO Auto-generated constructor stub
	}
	public FlightComponent() {
		// TODO Auto-generated constructor stub
	}
	public CachedRowSet seach(String source_city, String dest_city)throws SQLException {
		// TODO Auto-generated method stub
		String sql="select * from flights where source_city=?"+"and dest_city=?";
		RowSetFactory rowSetProvider = RowSetProvider.newFactory();
		
		CachedRowSet rowSet=rowSetProvider.createCachedRowSet();
		rowSet.setUrl("jdbc:mysql://localhost:3306/devops\",\"admin\",\"admin");
		rowSet.setCommand(sql);
		rowSet.setString(1,source_city);
		rowSet.setString(2,dest_city);
		rowSet.execute();
		
		
		return rowSet;

	}



}
