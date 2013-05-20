package com.golden.core;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.golden.dao.UserDAO;
import com.golden.entities.User;

public class UserSubscriberTest {
	private UserDAO dao;
	@Before
	public void setUp() throws Exception {
	    dao = mock(UserDAO.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void subscribe_shouldSubscribeAUser() {
         UserSubscriber signer = new UserSubscriber(dao);
         signer.subscribe("marmout");
     //    verify(dao).insert("marmout", 0));
	}

}
