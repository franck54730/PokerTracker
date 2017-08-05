package com.winaspy.helpers.poker.tracker.model;

import java.util.HashMap;
import java.util.Map;

public class Contexte {
	private Joueur bouton;
	private Joueur cutOff;
	
	private Map<Joueur, Boolean> dejaJouer;
	
	public Contexte() {
		dejaJouer = new HashMap<>();
	}
	
	public Joueur getBouton() {
		return bouton;
	}
	public void setBouton(Joueur bouton) {
		this.bouton = bouton;
	}
	public Joueur getCutOff() {
		return cutOff;
	}
	public void setCutOff(Joueur cutOff) {
		this.cutOff = cutOff;
	}
	
	public boolean getDejaJouer(Joueur j) {
		return dejaJouer.get(j);
	}
	
	public void aJouer(Joueur j) {
		dejaJouer.put(j, true);
	}
}
