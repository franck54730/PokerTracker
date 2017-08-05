package com.winaspy.helpers.poker.tracker.model.coup.action.flop;

import com.winaspy.helpers.poker.tracker.model.Contexte;
import com.winaspy.helpers.poker.tracker.model.Statistique;
import com.winaspy.helpers.poker.tracker.model.coup.action.Raise;

public class RaiseFlop extends FlopAction implements Raise {

	@Override
	public void addStatistique(Contexte c) {
		getAuteur().getStatistique().incNbRaise();
		

		

		if(c.isCbet()) {
			getAuteur().getStatistique().incNbRaiseToCBet();
		}
		
		if(c.estAggresseur(getAuteur()) && !c.quelquunAParler()) {
			getAuteur().getStatistique().incNbCBet();
			c.startCBet();
		}
	}

}
