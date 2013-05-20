package com.golden.gui;
public class authentification {

	String login;
	char[] motDePass;
	
	authentification(String login, char[] motDePass){
		this.login = login;
		this.motDePass = motDePass;
	}
	
	
	String ValidationAuthentification(){
	
		
		/***
		check de la base de donnee et recuperation du login
		***/
		
		/****
		si this.login et this.motDePass correcte
		return "true";
		****/
	
		/****
		si this.login faux
		return "nom utilisateur erroné";
		****/
		
		/****
		si this.motDePass faux
		return "Mot de passe erroné";
		****/
		
		return "true";
	}
	
}


