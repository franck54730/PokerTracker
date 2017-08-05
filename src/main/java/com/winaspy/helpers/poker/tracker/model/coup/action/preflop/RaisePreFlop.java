package com.winaspy.helpers.poker.tracker.model.coup.action.preflop;

import com.winaspy.helpers.poker.tracker.model.Contexte;
import com.winaspy.helpers.poker.tracker.model.Statistique;
import com.winaspy.helpers.poker.tracker.model.coup.action.Raise;

public class RaisePreFlop extends PreFlopAction implements Raise {

	@Override
	public void addStatistique(Contexte c) {

		getAuteur().getStatistique().incNbRaise();
		c.setAggresseur(getAuteur());
		
		getAuteur().getStatistique().incNbPFRaise();
		if(!c.getDejaJouer(getAuteur())) {
			getAuteur().getStatistique().incNbPFBet();
			c.aJouer(getAuteur());
		}
		
		if((c.estCO(getAuteur()) || c.estBTN(getAuteur())) && !c.quelquunAParler()) {
			getAuteur().getStatistique().incNbVolBlindes();
			getAuteur().getStatistique().incNbOpportuniteVolBlindes();
		}
	}

}
