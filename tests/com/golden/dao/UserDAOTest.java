package com.golden.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.golden.entities.User;
import com.golden.technique.DBConnection;

public class UserDAOTest {

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void findAll_shouldReturnAllUsers() {
	     ArrayList<User> players = new ArrayList<User>();
	     players.add(new User(1, "hammiya", 0));
	     players.add(new User(2, "soussou", 0));
	     UserDAO dataAccess = UserDAO.getInstance();
	     assertTrue(dataAccess.findAll().containsAll(players));
	}
	@Test
	public void getInstance_shouldAlwaysReturnSameObject(){
		UserDAO witness = UserDAO.getInstance();
	    for (int i = 0; i < 10 ; i++){
	    	assertEquals(witness, UserDAO.getInstance());
	    }
	}
	@Test
	public void insert_shouldInsertUserInDatabase(){
		UserDAO dao = UserDAO.getInstance();
		//User aUser = new User(User.UNASSIGNED, "chakalita", 0);
		//dao.insert("chakalita", 0);
		for (User user : dao.findAll()){
			if (user.getPseudo().equals("")){
				
			}
		}
	}
	@Test(expected=DuplicatedUserException.class)
	public void insert_shouldThrowDuplicatedUserException(){
		UserDAO dao = UserDAO.getInstance();
	//	dao.insert("soussou", 0);
	}

}
