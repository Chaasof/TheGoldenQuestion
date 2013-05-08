package com.golden.utilities;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.golden.dao.QuestionDAO;
import com.golden.entities.Question;
import static org.mockito.Mockito.*;

public class QuestionGeneratorTest {
	private QuestionGenerator generator;
	private QuestionDAO dataSource;

	@Before
	public void setUp() throws Exception {
		dataSource = mock(QuestionDAO.class);
		LinkedList<Question> questions = new LinkedList<Question>();
		questions.add(new Question(1, "Qui etes vous?1", "A human", "kablam",
		        "festus", "chiromi"));
		questions.add(new Question(2, "Qui etes vous?2", "A human", "kablam",
		        "festus", "chiromi"));
		questions.add(new Question(3, "Qui etes vous?3", "A human", "kablam",
		        "festus", "chiromi"));
		questions.add(new Question(4, "Qui etes vous?4", "A human", "kablam",
		        "festus", "chiromi"));
		questions.add(new Question(5, "Qui etes vous?5", "A human", "kablam",
		        "festus", "chiromi"));
		questions.add(new Question(6, "Qui etes vous?6", "A human", "kablam",
		        "festus", "chiromi"));
		when(dataSource.findAll()).thenReturn(questions);
		generator = new QuestionGenerator(dataSource);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getQuestionShouldReturnAQuestionObject() {
		assertNotNull(generator.getQuestion());
	}

	@Test
	public void getQuestionShouldReturnDifferentQuestionObjects() {

		Set<Question> distinctQuestions = new HashSet<Question>();
		for (int i = 0; i < 6; i++) {
			distinctQuestions.add(generator.getQuestion());
		}
		assertEquals(6, distinctQuestions.size());
	}

	@Test(expected = NoMoreDistinctQuestionException.class)
	public void getQuestionShouldThrow_NoMoreDistinctQuestionsException_When_More_Questions_UnAvailable() {
		int bigNumber = 100;
		for (int i = 0; i < bigNumber; i++) {
			generator.getQuestion();
		}
	}
}
