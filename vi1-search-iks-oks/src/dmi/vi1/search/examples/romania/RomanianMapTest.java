package dmi.vi1.search.examples.romania;

import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.GraphSearch;
import dmi.vi1.search.framework.Problem;
import dmi.vi1.search.informed.AStarSearch;
import dmi.vi1.search.uninformed.BreadthFirstSearch;
import dmi.vi1.search.uninformed.DepthFirstSearch;
import dmi.vi1.search.uninformed.UniformCostSearch;

public class RomanianMapTest {

	public static void main(String[] args) {		
		RomanianMapActionsFunctions actionsFunction = new RomanianMapActionsFunctions();
		RomanianMapResultFunction resultFunction = new RomanianMapResultFunction();
		RomanianMapGoalTest goalTest = new RomanianMapGoalTest();
		RomanianMapStepCostFunction stepCostFunction =  new RomanianMapStepCostFunction();
		Problem romanianMapProblem  = new Problem
				("Arad", actionsFunction, resultFunction, goalTest, stepCostFunction);
		BreadthFirstSearch bfSearch = new BreadthFirstSearch();
		DepthFirstSearch dfSearch = new DepthFirstSearch(new GraphSearch());
		UniformCostSearch ucSearch = new UniformCostSearch();
		AStarSearch asearch = new AStarSearch(new GraphSearch(), new RomanianMapHeuristicFunction());
		try {
			System.out.println("Pretraga...");
			//List<Action> actions = bfSearch.search(romanianMapProblem);
			//List<Action> actions = dfSearch.search(romanianMapProblem);
			//List<Action> actions = bfSearch.search(romanianMapProblem);			
			
			List<Action> actions = asearch.search(romanianMapProblem);
			
			System.out.println("Rezultat...");
			for(Action a:actions){
				System.out.println(a.toString());
			}
		} catch (Exception e) {		
			e.printStackTrace();
		}		
	}// TODO Auto-generated method stub

}

