package com.golden.core;

import com.golden.dao.UserDAO;
import com.golden.entities.User;

public class UserSubscriber {
	private UserDAO dataAccess;

	public UserSubscriber(UserDAO dao) {
		dataAccess = dao;
	}

	public void subscribe(String pseudo) {
		dataAccess.insert(new User(0, pseudo , 0));
	}
}
