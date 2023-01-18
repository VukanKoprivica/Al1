package dmi.vi1.search.uninformed;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;
import dmi.vi1.search.framework.GoalTest;
import dmi.vi1.search.framework.ResultFunction;
import dmi.vi1.search.framework.StepCostFunction;

public abstract class UninformedSearch {
	
protected Object initialState;
	
	protected ActionsFunction actionsFunction;
	
	protected ResultFunction resultFunction;
	
	protected GoalTest goalTest;
	
	protected StepCostFunction stepCostFunction;
	
	public UninformedSearch(Object initialState, ActionsFunction actionsFunction,
			ResultFunction resultFunction, GoalTest goalTest,
			StepCostFunction stepCostFunction) {
		super();
		this.initialState = initialState;
		this.actionsFunction = actionsFunction;
		this.resultFunction = resultFunction;
		this.goalTest = goalTest;
		this.stepCostFunction = stepCostFunction;
	}
	
	public abstract List<Action> search();
	
	protected List<Action> solution(HashMap<Object, StateActionPair> history, Object finalState){
		Object state = finalState;
		LinkedList<Action> actions = new LinkedList<>();
		
		while(history.containsKey(state) && !state.equals(initialState)) {
			StateActionPair sap = history.get(state);
			actions.addFirst(sap.getAction());
			state = sap.getState();
		}
		
		return (List<Action>) actions;
	}
}
