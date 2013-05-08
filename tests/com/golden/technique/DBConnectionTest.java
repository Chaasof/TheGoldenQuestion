package com.golden.technique;

import static org.junit.Assert.*;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DBConnectionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getInstance_ShouldReturnConnectionObject() throws ClassNotFoundException, SQLException {
	    assertNotNull(DBConnection.getInstance().getConnection());
	}
	@Test
	public void getInstance_ShouldReturnSameAlwaysConnectionObject() throws ClassNotFoundException, SQLException {
	    Connection base = DBConnection.getInstance().getConnection();
	    for (int i = 0; i < 10; i++){
	    	assertEquals(base, DBConnection.getInstance().getConnection());
	    }
	}
	
}
