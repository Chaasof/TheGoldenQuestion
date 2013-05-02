package com.golden.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.golden.dao.QuestionDAO;
import com.golden.entities.Question;

public class QuestionGenerator {
	private List<Question> allQuestions;
	private List<Integer> usedIndexes;
	public QuestionGenerator(QuestionDAO dao){
		allQuestions = dao.findAll();
		usedIndexes = new ArrayList<Integer>();
	}
	
	public Question getQuestion() {
	    if (allQuestions.size() <= 0){
	    	throw new NoMoreDistinctQuestionException();
	    }
		Random rand = new Random();
	    int chosen = rand.nextInt(allQuestions.size());
	    Question chosenQuestion = allQuestions.get(chosen);
	    allQuestions.remove(chosen);
	    return chosenQuestion;
	}
}
