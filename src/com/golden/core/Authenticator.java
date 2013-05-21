package com.golden.core;

import com.golden.dao.PlayerDAO;

public class Authenticator {

	public boolean verifyUser(String login,String password){
		return PlayerDAO.getInstance().verifyUser(login, password);
	}

}
