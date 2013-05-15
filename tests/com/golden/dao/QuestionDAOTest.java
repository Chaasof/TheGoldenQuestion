package com.golden.dao;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.golden.entities.Question;

public class QuestionDAOTest {

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void findAll_shouldReturn_all_questions(){
		Question q1 = new Question(1, "Quel est la capital de la France?", "Paris", "Tunis", "Bordeaux", "Marseille");
		Question q2 = new Question(2, "Quelle est le moteur de recherche le plus utilisé dans le monde?", "Google", "Yahoo", "DuckDuckGo", "Lawij");
        ArrayList<Question> expected = new ArrayList<Question>();
        expected.add(q1);
        expected.add(q2);
        QuestionDAO dataAccess = QuestionDAO.getInstance();
        assertTrue(dataAccess.findAll().containsAll(expected));
	}
	@Test 
	public void getInstance_shouldReturn_always_sameObject(){
		QuestionDAO witness = QuestionDAO.getInstance();
	    for (int i = 0; i < 10 ; i++){
	    	assertEquals(witness, QuestionDAO.getInstance());
	    }
	}

}
