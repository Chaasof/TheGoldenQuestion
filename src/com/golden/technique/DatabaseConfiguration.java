package com.golden.technique;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatabaseConfiguration {
	private Properties configuration;

	public DatabaseConfiguration(String filePath) {
		try {
		configuration = new Properties();
		InputStream input = DatabaseConfiguration.class.getResourceAsStream(filePath);
		configuration.load(input);
		}
		catch (IOException e){
			throw new RuntimeException(e);
		}
	}

	public String getDatabaseName() {
		return configuration.getProperty("database");
	}

	public String getUserName() {
		return configuration.getProperty("username");
	}

	public String getPassword() {
		return configuration.getProperty("password");
	}

	public String getUrl() {
		return configuration.getProperty("url");
	}
}
