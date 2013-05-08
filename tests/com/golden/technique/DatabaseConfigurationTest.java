package com.golden.technique;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DatabaseConfigurationTest {
	private DatabaseConfiguration configuration;

	@Before
	public void setUp() throws Exception {
		configuration = new DatabaseConfiguration("confTest.properties");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getDatabaseName_ShouldReturnDatabaseNameInTestFile() {
		assertEquals("store", configuration.getDatabaseName());
	}

	@Test
	public void getUserName_ShouldReturnNameInTestFile() {
		assertEquals("bill", configuration.getUserName());
	}

	@Test
	public void getPassword_ShouldReturnPasswordInTestFile() {

		assertEquals("ninja", configuration.getPassword());
	}

	@Test
	public void getDatabaseUrl_ShouldReturnUrlInTestFile() {
		assertEquals("http://localhost", configuration.getUrl());
	}
	
	@Test
	public void constructor_ShouldBuildConfigurationObjectWithOutOfClassLoaderRootLocatedFile() {
       DatabaseConfiguration conf = new DatabaseConfiguration("/com/golden/config/conf.properties");
	   assertNotNull(conf);
	}
	
	@Test(expected=RuntimeException.class)
	public void constructor_ShouldThrowRuntimeExceptionWhenFileNotFound() {
       DatabaseConfiguration conf = new DatabaseConfiguration("t5armija.pro");
	}
	
}
