package com.golden.core;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.golden.dao.PlayerDAO;
import com.golden.entities.Player;

public class PlayerRankerTest {
	private PlayerDAO dao;

	@Before
	public void setUp() throws Exception {
		dao = mock(PlayerDAO.class);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void itShouldReturnAllPlayersRanked() {
		List<Player> players = new ArrayList<Player>();
		players.add(new Player(1, "marmout", "ninja", 10));
		players.add(new Player(2, "manson", "aaa", 5));
		players.add(new Player(3, "jin", "bbb", 3));
		players.add(new Player(4, "voldo", "zztop", 15));
		when(dao.findAll()).thenReturn(players);
		PlayerRanker ranker = new PlayerRanker(dao);
		List<Player> rankedPlayers = ranker.getRankedPlayer();
		verify(dao).findAll();
		for (int i = 0; i < (rankedPlayers.size() - 1); i++) {
			assertTrue(rankedPlayers.get(i).getBestScore() >= rankedPlayers
			        .get(i + 1).getBestScore());
		}
	}

}
