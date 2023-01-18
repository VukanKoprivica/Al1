package dmi.vi1.search.examples.eightpuzzle;

import dmi.vi1.search.framework.GoalTest;



/**
 * @author Bojana Dimic Surla <bdimic@uns.ac.rs>
 * 
 */
public class EightPuzzleGoalTest implements GoalTest {
	EightPuzzleBoard goal = new EightPuzzleBoard(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 });

	public boolean isGoalState(Object state) {
		return state.equals(goal);
	}
}