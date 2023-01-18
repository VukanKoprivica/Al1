package dmi.vi1.search.examples.tops;

import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.GraphSearch;
import dmi.vi1.search.framework.Problem;
import dmi.vi1.search.uninformed.BreadthFirstSearch;
import dmi.vi1.search.uninformed.DepthFirstSearch;

public class TopsMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[][]board = {
				{0,0,0,0,0,0,0,0},
				{0,0,0,1,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,1,0,1,0,0,1,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
		} ;
		TopsState initalState = new TopsState(board);
		TopsActionsFunction taf = new TopsActionsFunction();
		TopsGoalTest tgt = new TopsGoalTest();
		TopsResultFunction trf = new TopsResultFunction();
		TopsStepCost tsc = new TopsStepCost();
		
		Problem p = new Problem(initalState, taf, trf, tgt, tsc);
		BreadthFirstSearch bfs = new BreadthFirstSearch(new GraphSearch());
		DepthFirstSearch dfs = new DepthFirstSearch(new GraphSearch());
		
		List<Action> list= dfs.search(p);
		TopsState newS = initalState;
		System.out.println(newS);
		for(Action a :list) {
			newS = (TopsState)trf.result(newS, a);
			System.out.println(newS);
			System.out.println(a);
		}
		
		

	}

}
