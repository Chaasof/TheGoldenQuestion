package com.golden.entities;

public class User {
	public static final int UNASSIGNED = -1;
	
	private int id;
	private String pseudo;
	private int bestScore;

	public User(int id, String pseudo, int bestScore) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.bestScore = bestScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getBestScore() {
		return bestScore;
	}

	public void setBestScore(int bestScore) {
		this.bestScore = bestScore;
	}

	@Override
	public boolean equals(Object obj) {
		User user = (User) obj;
		return (user.getId() == this.id);
	}
}
