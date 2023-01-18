package dmi.vi1.search.examples.fourinarow;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;
import dmi.vi1.search.games.GameState;

public class FIARActionFunction implements ActionsFunction {

	@Override
	public List<Action> actions(Object s) {
		// TODO Auto-generated method stub
		
		
		GameState state  = ((GameState) s);
		FourInARowBoard board = (FourInARowBoard) state.getBoard();
		List<Action>list = new ArrayList<Action>();
		int player = (int)state.getPlayerToMove();
		
		for(int i = 0;i<board.X_DIMENSION;i++) {
			if(board.getValueAt(0, i)==0) {
				list.add(new FIARAction(player, i));
			}
		}
		
		
		return list;
	}

}
