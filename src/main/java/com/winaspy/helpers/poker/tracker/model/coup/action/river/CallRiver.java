package com.winaspy.helpers.poker.tracker.model.coup.action.river;

import com.winaspy.helpers.poker.tracker.model.Contexte;
import com.winaspy.helpers.poker.tracker.model.Statistique;
import com.winaspy.helpers.poker.tracker.model.coup.action.Call;

public class CallRiver extends RiverAction implements Call{

	@Override
	public void addStatistique(Contexte c) {
		getAuteur().getStatistique().incNbCall();
	}

}
