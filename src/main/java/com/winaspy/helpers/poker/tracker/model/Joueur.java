package com.winaspy.helpers.poker.tracker.model;

import com.winaspy.helpers.poker.tracker.model.carte.Historique;

public class Joueur {
	
	private String nom;
	
	private Historique historique;
	
	private Statistique statistique;

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

	public Statistique getStatistique() {
		return statistique;
	}

	public void setStatistique(Statistique statistique) {
		this.statistique = statistique;
	}
	
	
}
