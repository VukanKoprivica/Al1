package dmi.vi1.search.uninformed;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import dmi.vi1.search.datastructure.LIFOQueue;
import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;
import dmi.vi1.search.framework.GoalTest;
import dmi.vi1.search.framework.ResultFunction;
import dmi.vi1.search.framework.StepCostFunction;


public class CustomDFS extends UninformedSearch{
	
	
	public CustomDFS(Object initialState, ActionsFunction actionsFunction,
			ResultFunction resultFunction, GoalTest goalTest,
			StepCostFunction stepCostFunction) {
		super(initialState, actionsFunction, resultFunction, goalTest, stepCostFunction);
	}
	
	@Override
	public List<Action> search() {
		LIFOQueue<Object> stack = new LIFOQueue<>();
		HashSet<Object> explored = new HashSet<>();
		HashMap<Object, StateActionPair> history = new HashMap<>();
		
		stack.push(initialState);
		
		while(!stack.isEmpty()) {
			Object currentState = stack.pop();
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
					stack.push(newState);
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
