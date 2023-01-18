package dmi.vi1.search.examples.romania;

import java.util.List;

import dmi.vi1.search.examples.labyrinth.Labyrinth;
import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.GraphSearch;
import dmi.vi1.search.framework.Problem;
import dmi.vi1.search.uninformed.BreadthFirstSearch;
import dmi.vi1.search.uninformed.DepthFirstSearch;
import dmi.vi1.search.uninformed.UniformCostSearch;

public class RomanianMapMain {

	public static void main(String[] args) throws Exception {
		
		
		  RomanianMapState initialState = new RomanianMapState("Arad");
		  RomanianMapGoalTest goalTest = new RomanianMapGoalTest();
		  RomanianMapStepCostFunction costFunction = new RomanianMapStepCostFunction();
		  RomanianMapActionsFunction actionsFunction = new
		  RomanianMapActionsFunction(); RomanianMapResultFunction resultFunction = new
		  RomanianMapResultFunction();
		  
		  
		  Problem p = new Problem(initialState, actionsFunction, resultFunction,
		  goalTest, costFunction );
		  
		  BreadthFirstSearch bfs = new BreadthFirstSearch(new GraphSearch());
		  DepthFirstSearch dfs = new DepthFirstSearch(new GraphSearch());
		  UniformCostSearch ucs = new UniformCostSearch(new GraphSearch());
		  
		  for (Action a : bfs.search(p)) System.out.println(a);
		  
		  System.out.println("-----");
		  
		  for (Action a : ucs.search(p)) 
			  System.out.println(a);
		 

		
		

	}

}
