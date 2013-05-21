package com.golden.integration;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.golden.core.Scorer;
import com.golden.dao.PlayerDAO;
import com.golden.entities.Player;

public class ScorerDataAccessTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void updateShouldUpdateInDatabase() {
	    PlayerDAO dao = PlayerDAO.getInstance();
	    Scorer scoreHandler = new Scorer(dao);
	    Player player = dao.findAll().get(0);
	    assertTrue(scoreHandler.update(player, 2000));
	}

}
