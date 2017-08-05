package com.winaspy.helpers.poker.tracker.model.coup.action.preflop;

import com.winaspy.helpers.poker.tracker.model.Contexte;
import com.winaspy.helpers.poker.tracker.model.Statistique;
import com.winaspy.helpers.poker.tracker.model.coup.action.Call;

public class CallPreFlop extends PreFlopAction implements Call {

	@Override
	public void addStatistique(Contexte c) {
		if(!c.getDejaJouer(getAuteur())) {
			getAuteur().getStatistique().incNbPFBet();
			c.aJouer(getAuteur());
		}
	}

}
