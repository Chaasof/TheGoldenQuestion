package com.golden.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.golden.entities.Player;
import com.golden.technique.DBConnection;

public class PlayerDAOTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void findAll_shouldReturnAllPlayers() {
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player(1, "hammiya", "aaa", 0));
		players.add(new Player(2, "soussou", "aaa", 0));
		PlayerDAO dataAccess = PlayerDAO.getInstance();
		assertTrue(dataAccess.findAll().containsAll(players));
	}

	@Test
	public void getInstance_shouldAlwaysReturnSameObject() {
		PlayerDAO witness = PlayerDAO.getInstance();
		for (int i = 0; i < 10; i++) {
			assertEquals(witness, PlayerDAO.getInstance());
		}
	}

	@Test
	public void insert_shouldInsertPlayerInDatabaseAndreturnEntity() {
		PlayerDAO dao = PlayerDAO.getInstance();
		Player player = dao.insert("chakalita", "aaa");
		assertEquals(player.getPseudo(), "chakalita");
		assertEquals(player.getPassword(), "aaa");
		assertEquals(player.getBestScore(), 0);	
	}
    @Test 
    public void update_ShouldUpdatePlayerInDatabase() {
    	PlayerDAO dao = PlayerDAO.getInstance();
    	Player player = new Player(1,"hammiya", "aaa", 10);
    	assertTrue(dao.update(player));
    }
    @Test 
    public void update_ShouldReturnFalseIfPlayerNotInDatabase() {
    	PlayerDAO dao = PlayerDAO.getInstance();
    	Player nonExistingPlayer = new Player(2149,"ham", "aa", 30);
    	assertFalse(dao.update(nonExistingPlayer));
    }
	@Test(expected = DuplicatedPlayerException.class)
	public void insert_shouldThrowDuplicatedPlayerException() {
		PlayerDAO dao = PlayerDAO.getInstance();
		dao.insert("soussou","aaa");
	}

}
