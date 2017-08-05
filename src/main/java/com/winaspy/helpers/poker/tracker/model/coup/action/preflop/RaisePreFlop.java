package com.winaspy.helpers.poker.tracker.model.coup.action.preflop;

import com.winaspy.helpers.poker.tracker.model.Contexte;
import com.winaspy.helpers.poker.tracker.model.Statistique;
import com.winaspy.helpers.poker.tracker.model.coup.action.Raise;

public class RaisePreFlop extends PreFlopAction implements Raise {

	@Override
	public void addStatistique(Contexte c) {
		if(!c.getDejaJouer(getAuteur())) {
			getAuteur().getStatistique().incNbPFBet();
			c.aJouer(getAuteur());
		}
		
	}

}
