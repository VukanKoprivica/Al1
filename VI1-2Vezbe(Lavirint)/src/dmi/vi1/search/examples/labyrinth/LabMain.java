package dmi.vi1.search.examples.labyrinth;

import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.GraphSearch;
import dmi.vi1.search.framework.Problem;
import dmi.vi1.search.uninformed.BreadthFirstSearch;
import dmi.vi1.search.uninformed.CustomBFS;
import dmi.vi1.search.uninformed.DepthFirstSearch;
import dmi.vi1.search.uninformed.UniformCostSearch;

public class LabMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		LabState initalState = new LabState(0, 0); 
		LabActionsFunction laf = new LabActionsFunction();
		LabGoalTest lgt = new LabGoalTest();
		LabResultFunction lrf = new LabResultFunction();
		LabStepCostFunction lscf = new LabStepCostFunction();
		
		Problem p = new Problem(initalState, laf, lrf, lgt, lscf);
		
		BreadthFirstSearch bfs = new BreadthFirstSearch(new GraphSearch());
		List<Action> bfss = bfs.search(p);
		System.out.println("Broj poseta:"+lgt.poseta);
		System.out.println("Broj koraka:"+bfss.size());
		for(Action a: bfss) {
			System.out.println(a);
		}
		System.out.println("--------------------------------------------");
		
		DepthFirstSearch dfs = new DepthFirstSearch(new GraphSearch());
		lgt.poseta=0;
		List<Action> dfss = dfs.search(p);
		System.out.println("Broj poseta:"+lgt.poseta);
		System.out.println("Broj koraka:"+dfss.size());
		for(Action a: dfss) {
			System.out.println(a);
		}
		System.out.println("--------------------------------------------");
		
		UniformCostSearch ucs = new UniformCostSearch(new GraphSearch());
		lgt.poseta=0;
		List<Action> ucss = ucs.search(p);
		
		System.out.println("Broj poseta:"+lgt.poseta);
		System.out.println("Broj koraka:"+ucss.size());
		for(Action a: ucss) {
			System.out.println(a);
		}
		System.out.println("--------------------------------------------");
		
		CustomBFS mybfs = new CustomBFS(initalState, laf, lrf, lgt, lscf);
		lgt.poseta=0;
		List<Action> mybfss = mybfs.search();
		
		System.out.println("Broj poseta:"+lgt.poseta);
		System.out.println("Broj koraka:"+ucss.size());
		for(Action a: mybfss) {
			System.out.println(a);
		}
		System.out.println("--------------------------------------------");
		
	}

}
