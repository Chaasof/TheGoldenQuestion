package com.golden.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.golden.entities.Player;
import com.golden.technique.DBConnection;

public class PlayerDAO {
	private static PlayerDAO soleInstance = null;
	private Connection base;

	private PlayerDAO() {
		base = DBConnection.getInstance().getConnection();
	}

	public static PlayerDAO getInstance() {
		if (soleInstance == null) {
			soleInstance = new PlayerDAO();
		}
		return soleInstance;
	}

	public List<Player> findAll() {
		List<Player> allUsers = new ArrayList<Player>();
		try {
			Statement statement = base.createStatement();
			ResultSet resultSet = statement
			        .executeQuery("SELECT * FROM player");
			resultSet.beforeFirst();
			while (resultSet.next()) {
				allUsers.add(new Player(resultSet.getInt(1), resultSet
				        .getString(2), resultSet.getString(3), resultSet
				        .getInt(4)));
			}
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return allUsers;
	}

	public Player insert(String pseudo, String password) {
		try {
			PreparedStatement statement = base
			        .prepareStatement("INSERT INTO player (pseudo, password ,meilleur_score) VALUES (?, ?, ?)");
			statement.setString(1, pseudo);
			statement.setString(2, password);
			statement.setInt(3, 0);
			statement.execute();
			statement.close();
			statement = base.prepareStatement("SELECT id FROM player WHERE pseudo = ?");
			statement.setString(1, pseudo);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			
			return new Player(resultSet.getInt(1), pseudo, password, 0);
		}
		catch (SQLException e) {
			if (e.getSQLState().equals("23000")) {
				throw new DuplicatedPlayerException(e);
			}
			else {
				throw new RuntimeException(e);
			}
		}
	}
}
