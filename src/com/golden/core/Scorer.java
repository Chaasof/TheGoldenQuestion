package com.golden.core;

import com.golden.dao.PlayerDAO;
import com.golden.entities.Player;

public class Scorer {
	private PlayerDAO dataAccess;

	public Scorer(PlayerDAO dao) {
		dataAccess = dao;
	}

	public boolean isHigher(Player player, int score) {
		return (score > player.getBestScore());
	}

	public boolean update(Player player, int newScore) {
		boolean success = false;
		if (isHigher(player, newScore)) {
			player.setBestScore(newScore);
			success = dataAccess.update(player);
		}
		return success;
	}
}
