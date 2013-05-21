package com.golden.entities;


public class Player implements Comparable<Player> {

	private int id;
	private String pseudo;
	private String password;
	private int bestScore;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Player(int id, String pseudo, String password, int bestScore) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.password = password;
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
		Player player = (Player) obj;
		return (player.getId() == this.id);
	}

	@Override
	public int compareTo(Player player) {
		if (this.getBestScore() > player.getBestScore()) {
			return 1;
		}
		else if (this.getBestScore() < player.getBestScore()) {
			return -1;
		}
		else {
			return 0;
		}

	}

}
