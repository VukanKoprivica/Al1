package dmi.vi1.search.examples.labyrinth;

import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.GraphSearch;
import dmi.vi1.search.framework.Problem;
import dmi.vi1.search.framework.Search;
import dmi.vi1.search.uninformed.BreadthFirstSearch;
import dmi.vi1.search.uninformed.CustomBFS;
import dmi.vi1.search.uninformed.CustomDFS;
import dmi.vi1.search.uninformed.CustomUCS;
import dmi.vi1.search.uninformed.DepthFirstSearch;
import dmi.vi1.search.uninformed.UniformCostSearch;
import dmi.vi1.search.uninformed.UninformedSearch;

public class Main {

	public static void main(String[] args) throws Exception {

		LabyrinthState initState = new LabyrinthState(0, 0);
		LabyrinthActionsFunction laf = new LabyrinthActionsFunction();
		LabyrinthResultFunction lrf = new LabyrinthResultFunction();
		LabyrinthGoalTest lgt = new LabyrinthGoalTest();
		LabyrinthStepCostFunction lscf = new LabyrinthStepCostFunction();

		Problem p = new Problem(initState, laf, lrf, lgt, lscf);

		DepthFirstSearch dfs = new DepthFirstSearch(new GraphSearch());
		BreadthFirstSearch bfs = new BreadthFirstSearch(new GraphSearch());
		UniformCostSearch ucs = new UniformCostSearch(new GraphSearch());
		runSearch(dfs, p, "DFS");
		runSearch(bfs, p, "BFS");
		runSearch(ucs, p, "UCS");
		
		CustomDFS customDFS = new CustomDFS(initState, laf, lrf, lgt, lscf);
		CustomBFS customBFS = new CustomBFS(initState, laf, lrf, lgt, lscf);
		CustomUCS customUCS = new CustomUCS(initState, laf, lrf, lgt, lscf);
		runSearch(customDFS, "Custom DFS");
		runSearch(customBFS, "Custom BFS");
		runSearch(customUCS, "Custom UCS");

	}
	
	// for running search algorithms from framework
	private static void runSearch(Search s, Problem p, String algName) throws Exception {
		List<Action> results = s.search(p);
		
		System.out.println("Running: " + algName);
		System.out.println(String.format("Broj koraka: %d", results.size()));
		System.out.println(String.format("Broj posećenih stanja: %d", LabyrinthGoalTest.visited));
		
		// print sequence of actions that leads to solution
		for (Action a : results) {
			System.out.println(a);
		}
		System.out.println("-------------------------------------");
		
		// reset counter for number of visited states
		LabyrinthGoalTest.visited = 0;
	}
	
	// for running custom implementation
	private static void runSearch(UninformedSearch s, String algName) throws Exception {
		List<Action> results = s.search();
		
		System.out.println("Running: " + algName);
		System.out.println(String.format("Broj koraka: %d", results.size()));
		System.out.println(String.format("Broj posećenih stanja: %d", LabyrinthGoalTest.visited));
		
		// print sequence of actions that leads to solution
		for (Action a : results) {
			System.out.println(a);
		}
		System.out.println("-------------------------------------");
		
		// reset counter for number of visited states
		LabyrinthGoalTest.visited = 0;
	}

}
