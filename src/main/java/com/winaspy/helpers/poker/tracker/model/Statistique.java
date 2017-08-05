package com.winaspy.helpers.poker.tracker.model;

public class Statistique {
	
	private int nbMainPF;	

	private int nbPFBet;
	
	private int nbPFRaise;
	
	private int nbVolBlindes;
	
	private int nbOpportuniteVolBlindes;
	
	private int nbRaise;
	
	private int nbCall;
	
	private int nbCBet;
	
	private int nbOpportuniteCBet;
	
	private int nbFoldToCBet;
	
	private int nbCallToCBet;
	
	private int nbRaiseToCBet;

	public double getVPIP() {
		return nbPFBet/nbMainPF;
	}
	
	public double getPFR() {
		return nbPFRaise/nbMainPF;
	}
	
	public double getATS() {
		return nbVolBlindes/nbOpportuniteVolBlindes;
	}
	
	public double getAF() {
		return nbRaise/nbCall;
	}
	
	public double getCBet() {
		return nbCBet/nbOpportuniteCBet;
	}
	
	public double getFoldToCBet() {
		return nbFoldToCBet/(nbFoldToCBet+nbCallToCBet+nbRaiseToCBet);
	}

	public int getNbMainPF() {
		return nbMainPF;
	}

	public void incNbMainPF() {
		this.nbMainPF++;
	}

	public int getNbPFBet() {
		return nbPFBet;
	}

	public void incNbPFBet() {
		this.nbPFBet++;
	}

	public int getNbPFRaise() {
		return nbPFRaise;
	}

	public void incNbPFRaise() {
		this.nbPFRaise++;
	}

	public int getNbVolBlindes() {
		return nbVolBlindes;
	}

	public void incNbVolBlindes() {
		this.nbVolBlindes++;
	}

	public int getNbOpportuniteVolBlindes() {
		return nbOpportuniteVolBlindes;
	}

	public void incNbOpportuniteVolBlindes() {
		this.nbOpportuniteVolBlindes++;
	}

	public int getNbRaise() {
		return nbRaise;
	}

	public void incNbRaise() {
		this.nbRaise++;
	}

	public int getNbCall() {
		return nbCall;
	}

	public void incNbCall() {
		this.nbCall++;
	}

	public int getNbCBet() {
		return nbCBet;
	}

	public void incNbCBet() {
		this.nbCBet++;
	}

	public int getNbOpportuniteCBet() {
		return nbOpportuniteCBet;
	}

	public void incNbOpportuniteCBet() {
		this.nbOpportuniteCBet++;
	}

	public int getNbFoldToCBet() {
		return nbFoldToCBet;
	}

	public void incNbFoldToCBet() {
		this.nbFoldToCBet++;
	}

	public int getNbCallToCBet() {
		return nbCallToCBet;
	}

	public void incNbCallToCBet() {
		this.nbCallToCBet++;
	}

	public int getNbRaiseToCBet() {
		return nbRaiseToCBet;
	}

	public void incNbRaiseToCBet() {
		this.nbRaiseToCBet++;
	}

	public void setNbMainPF(int nbMainPF) {
		this.nbMainPF = nbMainPF;
	}

	public void setNbPFBet(int nbPFBet) {
		this.nbPFBet = nbPFBet;
	}

	public void setNbPFRaise(int nbPFRaise) {
		this.nbPFRaise = nbPFRaise;
	}

	public void setNbVolBlindes(int nbVolBlindes) {
		this.nbVolBlindes = nbVolBlindes;
	}

	public void setNbOpportuniteVolBlindes(int nbOpportuniteVolBlindes) {
		this.nbOpportuniteVolBlindes = nbOpportuniteVolBlindes;
	}

	public void setNbRaise(int nbRaise) {
		this.nbRaise = nbRaise;
	}

	public void setNbCall(int nbCall) {
		this.nbCall = nbCall;
	}

	public void setNbCBet(int nbCBet) {
		this.nbCBet = nbCBet;
	}

	public void setNbOpportuniteCBet(int nbOpportuniteCBet) {
		this.nbOpportuniteCBet = nbOpportuniteCBet;
	}

	public void setNbFoldToCBet(int nbFoldToCBet) {
		this.nbFoldToCBet = nbFoldToCBet;
	}

	public void setNbCallToCBet(int nbCallToCBet) {
		this.nbCallToCBet = nbCallToCBet;
	}

	public void setNbRaiseToCBet(int nbRaiseToCBet) {
		this.nbRaiseToCBet = nbRaiseToCBet;
	}
	
}
