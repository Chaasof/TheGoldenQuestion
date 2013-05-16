package com.golden.integration;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.golden.core.QuestionGenerator;
import com.golden.dao.QuestionDAO;
import com.golden.entities.Question;

public class QuestionGeneratorDataAccessTest {
    List<Question> questions;
	@Before
	public void setUp() throws Exception {
		
		questions = new ArrayList<Question>();
	    questions.add(new Question(1, "Quel est la capital de la France?", "Paris", "Tunis", "Bordeaux", "Marseille"));
	    questions.add(new Question(2, "Quelle est le moteur de recherche le plus utilisé dans le monde?", "Google", "Yahoo", "DuckDuckGo", "Lawij"));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getQuestion_shouldReturnQuestionFromDatabase() {
		QuestionGenerator generator = new QuestionGenerator(QuestionDAO.getInstance());
		for (int i=0 ; i < questions.size() ; i++){
		     assertTrue(questions.contains(generator.getQuestion()));
		}
	}

}
