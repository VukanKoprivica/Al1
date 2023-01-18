package dmi.vi1.search.uninformed;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;
import dmi.vi1.search.framework.GoalTest;
import dmi.vi1.search.framework.ResultFunction;
import dmi.vi1.search.framework.StepCostFunction;


public class CustomUCS extends UninformedSearch{
	
	
	public CustomUCS(Object initialState, ActionsFunction actionsFunction,
			ResultFunction resultFunction, GoalTest goalTest,
			StepCostFunction stepCostFunction) {
		super(initialState, actionsFunction, resultFunction, goalTest, stepCostFunction);
	}
	
	@Override
	public List<Action> search() {
		PriorityQueue<StateCostPair> priorityQueue = new PriorityQueue<>();
		HashSet<Object> explored = new HashSet<>();
		HashMap<Object, StateActionPair> history = new HashMap<>();
		
		priorityQueue.add(new StateCostPair(initialState, 0.0));
		
		while(!priorityQueue.isEmpty()) {
			StateCostPair scp = priorityQueue.poll();
			Object currentState = scp.getState();
			double currentCost = scp.getCost();
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
					priorityQueue.add(new StateCostPair(newState, currentCost + stepCostFunction.c(currentState, action, newState)));
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
