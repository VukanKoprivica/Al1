package dmi.vi1.search.uninformed;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import dmi.vi1.search.datastructure.FIFOQueue;
import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;
import dmi.vi1.search.framework.GoalTest;
import dmi.vi1.search.framework.ResultFunction;
import dmi.vi1.search.framework.StepCostFunction;


public class CustomBFS extends UninformedSearch{
	
	
	public CustomBFS(Object initialState, ActionsFunction actionsFunction,
			ResultFunction resultFunction, GoalTest goalTest,
			StepCostFunction stepCostFunction) {
		super(initialState, actionsFunction, resultFunction, goalTest, stepCostFunction);
	}
	
	public List<Action> search() {
		// History hashmap where key is new state obtained by 
		// StateActionPair item when performing action on previous state
		HashMap<Object, StateActionPair> history = new HashMap<>();
		
		return null;
	}
	
}
