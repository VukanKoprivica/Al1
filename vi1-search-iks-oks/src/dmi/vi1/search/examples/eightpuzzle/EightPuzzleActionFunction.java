/**
 * 
 */
package dmi.vi1.search.examples.eightpuzzle;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;

/**
 * @author Bojana Dimic Surla <bdimic@uns.ac.rs>
 *
 */
public class EightPuzzleActionFunction implements ActionsFunction {

	
	@Override
	public List<Action> actions(Object s) {
		EightPuzzleBoard board = (EightPuzzleBoard) s;
		List<Action> actions = new ArrayList<Action>();

		if (board.canMoveGap(EightPuzzleBoard.UP)) {
			actions.add(EightPuzzleBoard.UP);
		}
		if (board.canMoveGap(EightPuzzleBoard.DOWN)) {
			actions.add(EightPuzzleBoard.DOWN);
		}
		if (board.canMoveGap(EightPuzzleBoard.LEFT)) {
			actions.add(EightPuzzleBoard.LEFT);
		}
		if (board.canMoveGap(EightPuzzleBoard.RIGHT)) {
			actions.add(EightPuzzleBoard.RIGHT);
		}
		return actions;
	}

}
