package com.golden.gui;

public class Question {

	
	String getQuestion(int i){
		//récuéprer une question de la base de donnee
		//le i entree en paramétre représente l'id unqiue de la question pour éviter qu'elle ne se répéte!
		//un random risque de redonner les meme question!
		String question ="";
		
		if(i==0){
		     question = "Quelle est la capitale de la Tunisie?";
		}
		else{
		     question = "Quelle est la capitale de la France?";
		}	
		return question;
	}

	String[] getReponseQuestion(int i){
		//récuéprer une question de la base de donnee
		String [] RepQ = {"Paris","Tunis","Alger","Tokyo"};
		
		return RepQ;
	}
	
	
}
