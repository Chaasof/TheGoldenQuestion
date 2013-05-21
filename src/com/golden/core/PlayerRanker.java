package com.golden.core;

import java.util.Collections;
import java.util.List;

import com.golden.dao.PlayerDAO;
import com.golden.entities.Player;

public class PlayerRanker {
	private PlayerDAO dataAccess;

	public PlayerRanker(PlayerDAO dao) {
		dataAccess = dao;
	}

	public List<Player> getRankedPlayer() {
		List<Player> allPlayers = dataAccess.findAll();
		Collections.sort(allPlayers, Collections.reverseOrder());
		return allPlayers;
	}
}
