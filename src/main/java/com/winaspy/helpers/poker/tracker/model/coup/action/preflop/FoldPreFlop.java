package com.winaspy.helpers.poker.tracker.model.coup.action.preflop;

import com.winaspy.helpers.poker.tracker.model.Contexte;
import com.winaspy.helpers.poker.tracker.model.Statistique;
import com.winaspy.helpers.poker.tracker.model.coup.action.Fold;

public class FoldPreFlop extends PreFlopAction implements Fold {

	@Override
	public void addStatistique(Contexte c) {
		if((c.estCO(getAuteur()) || c.estBTN(getAuteur())) && !c.quelquunAParler()) {
			getAuteur().getStatistique().incNbOpportuniteVolBlindes();
		}
	}

}
