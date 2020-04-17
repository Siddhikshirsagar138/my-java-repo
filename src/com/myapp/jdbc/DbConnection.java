package com.myapp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection
				("jdbc:mysql://localhost:3306/devops","admin","admin");//h2 protocol of db subprotocol ahe db is mem 1.url2,username3.password
	}

}
