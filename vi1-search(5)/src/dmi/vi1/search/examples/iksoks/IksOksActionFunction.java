package dmi.vi1.search.examples.iksoks;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.datastructure.XYLocation;
import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;
import dmi.vi1.search.games.GameState;

public class IksOksActionFunction implements ActionsFunction {

	@Override
	public List<Action> actions(Object s) {
		// TODO Auto-generated method stub
		
		
		GameState gs = (GameState)s;
		List<Action> actions = new ArrayList<>();
		
		IksOksBoard board = (IksOksBoard)gs.getBoard();
		String player = (String) gs.getPlayerToMove();
		
		for(XYLocation xy: board.getEmptyPositions()) {
			actions.add(new IksOksAction(xy,player));
		}
		
		
		
		return actions;
	}

}
