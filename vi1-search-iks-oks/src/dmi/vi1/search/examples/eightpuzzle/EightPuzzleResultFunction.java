/**
 * 
 */
package dmi.vi1.search.examples.eightpuzzle;


import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ResultFunction;

/**
 * @author Bojana Dimic Surla <bdimic@uns.ac.rs>
 *
 */
public class EightPuzzleResultFunction implements ResultFunction {
	
	@Override
	public Object result(Object s, Action a) {
		EightPuzzleBoard board = (EightPuzzleBoard) s;
		EightPuzzleBoard newBoard = new EightPuzzleBoard(board);
		
		if (EightPuzzleBoard.UP.equals(a)) {
			newBoard.moveGapUp();
			return newBoard;
		} else if (EightPuzzleBoard.DOWN.equals(a)) {
			newBoard.moveGapDown();
			return newBoard;
		} else if (EightPuzzleBoard.LEFT.equals(a)) {
			newBoard.moveGapLeft();
			return newBoard;
		} else if (EightPuzzleBoard.RIGHT.equals(a)) {
			newBoard.moveGapRight();
			return newBoard;
		}		
		return s;
	}

}
