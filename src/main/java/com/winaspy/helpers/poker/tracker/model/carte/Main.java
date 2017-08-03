package com.winaspy.helpers.poker.tracker.model.carte;

public class Main {
	private Cartes premiere;
	
	private Cartes deuxieme;

	public Main(Cartes premiere, Cartes deuxieme) {
		super();
		this.premiere = premiere;
		this.deuxieme = deuxieme;
	}
	
	public Cartes getPremiere() {
		return premiere;
	}

	public void setPremiere(Cartes premiere) {
		this.premiere = premiere;
	}

	public Cartes getDeuxieme() {
		return deuxieme;
	}

	public void setDeuxieme(Cartes deuxieme) {
		this.deuxieme = deuxieme;
	}
}
