package com.golden.core;

import com.golden.dao.PlayerDAO;
import com.golden.entities.Player;

public class PlayerSubscriber {
	private PlayerDAO dataAccess;

	public PlayerSubscriber(PlayerDAO dao) {
		dataAccess = dao;
	}

	public Player subscribe(String pseudo, String password) {
		Player player = null;
		if (!password.equals("")) {
			player = dataAccess.insert(pseudo, password);
		}
		else {
			throw new RuntimeException("Password Is Empty");
		}
	    return player;
	}
}
