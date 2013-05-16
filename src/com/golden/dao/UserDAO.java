package com.golden.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.golden.entities.User;
import com.golden.technique.DBConnection;

public class UserDAO {
	private static UserDAO soleInstance = null;
	private Connection base;

	private UserDAO() {
		base = DBConnection.getInstance().getConnection();
	}

	public static UserDAO getInstance() {
		if (soleInstance == null) {
			soleInstance = new UserDAO();
		}
		return soleInstance;
	}

	public List<User> findAll() {
		List<User> allUsers = new ArrayList<User>();
		try {
			Statement statement = base.createStatement();
			ResultSet resultSet = statement
			        .executeQuery("SELECT * FROM joueur");
			resultSet.beforeFirst();
			while (resultSet.next()) {
				allUsers.add(new User(resultSet.getInt(1), resultSet
				        .getString(2), resultSet.getInt(3)));
			}
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return allUsers;
	}

	public void insert(User user) {
		try {
              PreparedStatement statement = base.prepareStatement("INSERT INTO joueur VALUES (?, ?, ?)");
              statement.setInt(1, user.getId());
              statement.setString(2, user.getPseudo());
              statement.setInt(3, user.getBestScore());
              statement.execute();
		}
		catch (SQLException e) {
             if (e.getSQLState().equals("23000")){
            	 throw new DuplicatedUserException(e);
             }
             else {
            	 throw new RuntimeException(e);
             }
		}
	}
}
