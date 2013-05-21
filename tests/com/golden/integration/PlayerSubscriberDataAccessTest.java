package com.golden.integration;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.golden.core.PlayerSubscriber;
import com.golden.dao.PlayerDAO;
import com.golden.entities.Player;
import com.golden.technique.DBConnection;

public class PlayerSubscriberDataAccessTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void subscribe_ShouldSubscribeUserInDatabase() {
		PlayerDAO dao = PlayerDAO.getInstance();
		PlayerSubscriber signer = new PlayerSubscriber(dao);
		Player player = signer.subscribe("marmout", "ninja");
		List<Player> allPlayers = dao.findAll();
	    assertTrue(allPlayers.contains(player));
	}

}
