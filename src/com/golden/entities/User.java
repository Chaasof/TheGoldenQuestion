package com.golden.entities;

public class User {
    String id;
    String question;
    String reponseV;
    String reponseF1;
    String reponseF2;
    String reponseF3;
    public User(String id,String question,String reponseV,String reponseF1,String reponseF2,String reponseF3){
        this.id=id;
        this.question=question;
        this.reponseV=reponseV;
        this.reponseF1=reponseF1;
        this.reponseF2=reponseF2;
        this.reponseF3=reponseF3;
    }
    
    public String getId(){
        return id;
    }
    public String getQuestion(){
        return question;
    }

    public String getReponseV() {
		return reponseV;
	}


	public void setReponseV(String reponseV) {
		this.reponseV = reponseV;
	}
    
    public String getReponseF1() {
		return reponseF1;
	}


	public void setReponseF1(String reponseF1) {
		this.reponseF1 = reponseF1;
	}


	public String getReponseF2() {
		return reponseF2;
	}


	public void setReponseF2(String reponseF2) {
		this.reponseF2 = reponseF2;
	}


	public String getReponseF3() {
		return reponseF3;
	}


	public void setReponseF3(String reponseF3) {
		this.reponseF3 = reponseF3;
	}

    public String toString() {
        return "Id Question : " + id +
        		",\n Question : " + question +
        		",\n Proposition vrai : " + reponseV +
        		",\n Proposition fausse : " + reponseF1 +
        		",\n Proposition fausse : " + reponseF2 +
        		",\n Proposition fausse : " + reponseF3;
    }
}

