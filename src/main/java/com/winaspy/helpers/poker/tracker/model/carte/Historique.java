package com.winaspy.helpers.poker.tracker.model.carte;

import java.util.ArrayList;
import java.util.List;

public class Historique {

	private List<Main> histo;
	
	public Historique() {
		this.histo = new ArrayList<Main>();
	}

	public void addMain(Main m) {
		this.histo.add(m);
	}
	
	public Main getDerniereMain() {
		return this.histo.get(this.histo.size());
	}
}
