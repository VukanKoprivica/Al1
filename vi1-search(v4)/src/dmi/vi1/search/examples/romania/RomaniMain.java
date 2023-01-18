package dmi.vi1.search.examples.romania;


import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.GraphSearch;
import dmi.vi1.search.framework.Problem;
import dmi.vi1.search.uninformed.BreadthFirstSearch;
import dmi.vi1.search.uninformed.DepthFirstSearch;
import dmi.vi1.search.uninformed.UniformCostSearch;

public class RomaniMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		RomaniaState initState = new RomaniaState("Arad");
		
		RomaniaActionFunction raf = new RomaniaActionFunction();
		RomaniaResultFunction rrf = new RomaniaResultFunction();
		RomaniaGoalTest rgt = new RomaniaGoalTest();
		RomaniaStepCostFunction rscf = new RomaniaStepCostFunction();
		
		Problem problem =  new Problem(initState, raf, rrf, rgt, rscf);
		
		DepthFirstSearch dfs = new DepthFirstSearch(new GraphSearch());
		BreadthFirstSearch bfs = new BreadthFirstSearch(new GraphSearch());
		UniformCostSearch ucs = new UniformCostSearch(new GraphSearch());
		
		List<Action> actions = dfs.search(problem);
		
		for(Action a:actions) {
			System.out.println(a);
		}
		
		

	}

}
