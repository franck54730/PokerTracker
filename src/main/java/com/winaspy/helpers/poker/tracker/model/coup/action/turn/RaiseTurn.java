package com.winaspy.helpers.poker.tracker.model.coup.action.turn;

import com.winaspy.helpers.poker.tracker.model.Contexte;
import com.winaspy.helpers.poker.tracker.model.Statistique;
import com.winaspy.helpers.poker.tracker.model.coup.action.Raise;

public class RaiseTurn extends TurnAction implements Raise{

	@Override
	public void addStatistique(Contexte c) {
		getAuteur().getStatistique().incNbRaise();
	}

}
