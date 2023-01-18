/**
 * 
 */
package dmi.vi1.search.examples.eightpuzzle;

import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.GraphSearch;
import dmi.vi1.search.framework.Problem;
import dmi.vi1.search.informed.AStarSearch;
import dmi.vi1.search.informed.GreedyBestFirstSearch;

/**
 * @author Bojana Dimic Surla <bdimic@uns.ac.rs>
 *
 */
public class EightPuzzle {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Problem p = new Problem();
		EightPuzzleBoard initialState = new EightPuzzleBoard( new int[] { 7, 2, 4, 5, 0, 6, 8, 3, 1 });
		
		p.setActionsFunction(new EightPuzzleActionFunction());
		p.setResultFunction(new EightPuzzleResultFunction());
		p.setGoalTest(new EightPuzzleGoalTest());
		p.setStepCostFunction(new EightPuzzleStepCostFunction());
		p.setInitialState(initialState);
		
		AStarSearch aStar = new AStarSearch(new GraphSearch(), new MisplacedTilleHeuristicFunction());
		
		//GreedyBestFirstSearch bestFirst = new GreedyBestFirstSearch(new GraphSearch(), new ManhattanHeuristicFunction());
		
		List<Action> actions = aStar.search(p);
				
		System.out.println("Resenje: \n-------------");		
		
		// samo za ispis
		EightPuzzleBoard tempState = initialState;
		System.out.println(tempState);
		
		for(Action a: actions) {
			
			System.out.println(a);
			
			// ispis stanja
			tempState = (EightPuzzleBoard)new EightPuzzleResultFunction().result(tempState, a); 
			System.out.println(tempState);			
			
		}
		
	}

}
