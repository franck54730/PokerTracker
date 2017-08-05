package com.winaspy.helpers.poker.tracker.model.coup;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.winaspy.helpers.poker.tracker.model.Contexte;
import com.winaspy.helpers.poker.tracker.model.Joueur;
import com.winaspy.helpers.poker.tracker.model.Statistique;
import com.winaspy.helpers.poker.tracker.model.coup.action.Action;
import com.winaspy.helpers.poker.tracker.model.coup.action.flop.FlopAction;
import com.winaspy.helpers.poker.tracker.model.coup.action.preflop.PreFlopAction;
import com.winaspy.helpers.poker.tracker.model.coup.action.river.RiverAction;
import com.winaspy.helpers.poker.tracker.model.coup.action.turn.TurnAction;

public class Coup {
	
	private Contexte contexte;
	private Map<Joueur, ArrayList<Action>> actions;
	
	public List<Action> getFlop(Joueur j){
		ArrayList<Action> actionJoueur = actions.get(j);
		return (List<Action>) actionJoueur.stream().filter((action) -> (action instanceof FlopAction)).collect(Collectors.toList());
	}

	public List<Action> getPreFlop(Joueur j){
		ArrayList<Action> actionJoueur = actions.get(j);
		return (List<Action>) actionJoueur.stream().filter((action) -> (action instanceof PreFlopAction)).collect(Collectors.toList());
	}
	
	public List<Action> getRiver(Joueur j){
		ArrayList<Action> actionJoueur = actions.get(j);
		return (List<Action>) actionJoueur.stream().filter((action) -> (action instanceof RiverAction)).collect(Collectors.toList());
	}
	
	public List<Action> getTurn(Joueur j){
		ArrayList<Action> actionJoueur = actions.get(j);
		return (List<Action>) actionJoueur.stream().filter((action) -> (action instanceof TurnAction)).collect(Collectors.toList());
	}
	
	public void addStatistique(Contexte c) {
		actions.keySet().forEach(joueur->{
			joueur.getStatistique().incNbMainPF();
		});
	}
}
