package dmi.vi1.search.examples.fourinarow;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ResultFunction;
import dmi.vi1.search.games.GameState;

public class FIARResultFunction implements ResultFunction {

	@Override
	public Object result(Object s, Action a) {
		// TODO Auto-generated method stub
		GameState gs = (GameState)s;
		FIARAction action = (FIARAction)a;
		FourInARowBoard board = ((FourInARowBoard)gs.getBoard()).clone();
		
		int n;
		if(action.getMark()==board.RED_DOT) {
			n=board.YELLOW_DOT;
		}else {
			n=board.RED_DOT;
		}
		
		for(int i=board.Y_DIMENSION-1;i>=0;i--) {
			if(board.getValueAt(i,action.getXlocation())==0 ) {
				board.setValueAt(i, action.getXlocation(), n);
				break;
			}
		}
		
		GameState newGameState = new GameState(n, board);
		
		return newGameState;
	}

}
