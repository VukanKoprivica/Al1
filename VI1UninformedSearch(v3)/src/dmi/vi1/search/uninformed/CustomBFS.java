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
	
	@Override
	public List<Action> search() {
		FIFOQueue<Object> queue = new FIFOQueue<>();
		HashSet<Object> explored = new HashSet<>();
		HashMap<Object, StateActionPair> history = new HashMap<>();
		
		queue.push(initialState);
		
		while(!queue.isEmpty()) {
			Object currentState = queue.pop();
			if(explored.contains(currentState)) {
				continue;
			}
			explored.add(currentState);
			
			if(goalTest.isGoalState(currentState)) {
				return solution(history, currentState);
			}
			
			List<Action> availableActions = actionsFunction.actions(currentState);
			for(Action action: availableActions) {
				if(!explored.contains(action)) {
					Object newState = resultFunction.result(currentState, action);  
					queue.push(newState);
					if(!history.containsKey(newState)) {
						history.put(newState, new StateActionPair(currentState, action));
					}
				}
			}
		}
		
		System.out.println("Resenje nije pronadnjeno!");
		return null;
	}
	
}
