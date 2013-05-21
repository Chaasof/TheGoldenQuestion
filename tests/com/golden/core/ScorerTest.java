package com.golden.core;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.golden.dao.PlayerDAO;
import com.golden.entities.Player;

public class ScorerTest {
	PlayerDAO dao;

	@Before
	public void setUp() throws Exception {
		dao = mock(PlayerDAO.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void itShoudlUpdateScores() {
		Player player = new Player(5, "marmout", "ninja", 10);
		when(dao.update(player)).thenReturn(true);
		Scorer scoreHandler = new Scorer(dao);

		assertTrue(scoreHandler.update(player, 50));
		verify(dao).update(player);
	}

	@Test
	public void itShoudlReturnFalseIfNewScoreIsLesserThanOrEqualThanTheOlder() {
		Player player = new Player(5, "judge", "nin", 10);
		Scorer scoreHandler = new Scorer(dao);
		assertFalse(scoreHandler.update(player, 5));
	}

	@Test
	public void itShouldTestWhetherTheScoreIsHigherThanTheactualBestScore() {
		Player playerWinner = new Player(5, "marmout", "ninja", 10);
		Player playerLooser = new Player(6, "jin", "aaa", 10);
		Scorer scoreHandler = new Scorer(dao);
		assertTrue(scoreHandler.isHigher(playerWinner, 50));
		assertFalse(scoreHandler.isHigher(playerLooser, 5));
	}

}
