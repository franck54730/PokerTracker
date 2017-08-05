package com.winaspy.helpers.poker.tracker.model;

import java.util.HashMap;
import java.util.Map;

public class Contexte {
	private Joueur bouton;
	private Joueur cutOff;
	private Joueur aggresseur;
	
	private Map<Joueur, Boolean> dejaJouer;
	private boolean cbet;
	
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
	
	public boolean quelquunAParler() {
		for(Joueur joueur : dejaJouer.keySet()){
			if(dejaJouer.get(joueur))
				return true;
		}
		return false;
	}
	
	public boolean estCO(Joueur j) {
		return cutOff.equals(j);
	}
	
	public boolean estBTN(Joueur j) {
		return bouton.equals(j);
	}

	public boolean estAggresseur(Joueur auteur) {
		return aggresseur.equals(auteur);
	}

	public void startCBet() {
		cbet = true;
	}

	public Joueur getAggresseur() {
		return aggresseur;
	}

	public void setAggresseur(Joueur aggresseur) {
		this.aggresseur = aggresseur;
	}

	public Map<Joueur, Boolean> getDejaJouer() {
		return dejaJouer;
	}

	public void setDejaJouer(Map<Joueur, Boolean> dejaJouer) {
		this.dejaJouer = dejaJouer;
	}

	public boolean isCbet() {
		return cbet;
	}

	public void setCbet(boolean cbet) {
		this.cbet = cbet;
	}
	
	
}
