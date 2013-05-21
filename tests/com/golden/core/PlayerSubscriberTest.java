package com.golden.core;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.golden.dao.DuplicatedPlayerException;
import com.golden.dao.PlayerDAO;
import com.golden.entities.Player;

public class PlayerSubscriberTest {
	private PlayerDAO dao;
	@Before
	public void setUp() throws Exception {
	    dao = mock(PlayerDAO.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void subscribe_shouldSubscribeAUser() {
        String pseudo = "marmout";
        String password = "aaa";
        Player expectedPlayer = new Player(4, pseudo, password, 0);
		when(dao.insert(pseudo, password)).thenReturn(expectedPlayer); 
		PlayerSubscriber signer = new PlayerSubscriber(dao);
        
		Player actualPlayer = signer.subscribe(pseudo, password);
        
		verify(dao).insert(pseudo, password);
        assertEquals(expectedPlayer, actualPlayer);
	}
	@Test(expected=RuntimeException.class)
	public void subscribe_shouldThrowRuntimeExceptionWhenPasswordIsEmpty(){
		PlayerSubscriber signer = new PlayerSubscriber(dao);
		signer.subscribe("marmout", "");
	}
	
	@Test(expected=DuplicatedPlayerException.class)
	public void subscribe_shouldThrowDuplicatedPlayerException_WhenPlayerAlredyExists(){
		when(dao.insert("marmout", "aaa")).thenThrow(new DuplicatedPlayerException(new Exception("ORIGIN")));
		PlayerSubscriber signer = new PlayerSubscriber(dao);
		signer.subscribe("marmout", "aaa");
	}
}
