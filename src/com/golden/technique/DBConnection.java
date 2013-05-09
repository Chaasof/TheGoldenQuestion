package com.golden.technique;

import java.sql.*;

public class DBConnection {
	private String username;
	private String password;
	private String url;
	private String driver = "com.mysql.jdbc.Driver";
	private Connection connection;
	private static DBConnection soleInstance = null;

	private DBConnection() {
		DatabaseConfiguration conf = new DatabaseConfiguration("/com/golden/config/conf.properties");
		username = conf.getUserName();
		password = conf.getPassword();
		url = conf.getUrl() + conf.getDatabaseName();
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public static DBConnection getInstance() {
		if (soleInstance == null) {
			soleInstance = new DBConnection();
		}
		return soleInstance;
	}

	public Connection getConnection() {
		return connection;
	}

}