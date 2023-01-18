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
		FIFOQueue< Object> queue = new FIFOQueue<Object>();
		HashSet<Object> explored = new HashSet<Object>();
		HashMap<Object, StateActionPair> history = new HashMap<>();
		
		queue.push(initialState);
		while(!queue.isEmpty()) {
			Object currentState = queue.pop();
			if(explored.contains(currentState))continue;
			explored.add(currentState);
			if(goalTest.isGoalState(currentState))return solution(history, currentState);
			
			List<Action> avalableAction = actionsFunction.actions(currentState);
			for(Action action:avalableAction) {
				if(!explored.contains(action)) {
					Object resultState = resultFunction.result(currentState, action);
					queue.push(resultState);
					if(!history.containsKey(resultState))history.put(resultState, new StateActionPair(currentState, action));
				}
				
				
			}
			
		}
		System.out.println("Error");
		return null;
	}
	
}
