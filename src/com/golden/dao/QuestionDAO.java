package com.golden.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.golden.entities.Question;
import com.golden.technique.DBConnection;
import java.sql.Statement;

public class QuestionDAO {
	private Connection base;
	private static QuestionDAO soleInstance = null;

	private QuestionDAO() {
		base = DBConnection.getInstance().getConnection();
	}

	public static QuestionDAO getInstance() {
		if (soleInstance == null) {
			soleInstance = new QuestionDAO();
		}
		return soleInstance;
	}

	public List<Question> findAll() {
		List<Question> questions = new ArrayList<Question>();
		try {
			Statement statement = base.createStatement();
			ResultSet resultSet = statement
			        .executeQuery("SELECT * FROM question");
			resultSet.beforeFirst();
			while (resultSet.next()) {
				questions.add(new Question(resultSet.getInt(1), resultSet
				        .getString(2), resultSet.getString(3), resultSet
				        .getString(4), resultSet.getString(5), resultSet
				        .getString(6)));
			}
		}
		catch (SQLException e) {
            e.printStackTrace();
		    System.out.println("Error Code : " + e.getErrorCode());
		}
		return questions;
	}
}
