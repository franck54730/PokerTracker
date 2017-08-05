package com.winaspy.helpers.poker.tracker.model.coup.action.flop;

import com.winaspy.helpers.poker.tracker.model.Contexte;
import com.winaspy.helpers.poker.tracker.model.Statistique;
import com.winaspy.helpers.poker.tracker.model.coup.action.Fold;

public class FoldFlop extends FlopAction implements Fold{

	@Override
	public void addStatistique(Contexte c) {
		if(c.estAggresseur(getAuteur()) && !c.quelquunAParler()) {
			getAuteur().getStatistique().incNbOpportuniteCBet();
		}
		if(c.isCbet()) {
			getAuteur().getStatistique().incNbFoldToCBet();
		}
	}

}
