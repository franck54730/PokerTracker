package com.winaspy.helpers.poker.tracker.model.coup.action;

import com.winaspy.helpers.poker.tracker.model.Contexte;
import com.winaspy.helpers.poker.tracker.model.Joueur;
import com.winaspy.helpers.poker.tracker.model.Statistique;

public abstract class Action {
	
	private Joueur auteur;
	
	public abstract void addStatistique(Contexte c);

	public Joueur getAuteur() {
		return auteur;
	}

	public void setAuteur(Joueur auteur) {
		this.auteur = auteur;
	}
}

