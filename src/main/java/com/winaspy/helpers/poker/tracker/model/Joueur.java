package com.winaspy.helpers.poker.tracker.model;

import com.winaspy.helpers.poker.tracker.model.carte.Historique;

public class Joueur {
	
	private String nom;
	
	private Historique historique;

	public Joueur(String nom) {
		super();
		this.nom = nom;
		this.historique = new Historique();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Historique getHistorique() {
		return historique;
	}

	public void setHistorique(Historique historique) {
		this.historique = historique;
	}
	
	
}
