package dmi.vi1.search.examples.iksoks;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.datastructure.XYLocation;
import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;
import dmi.vi1.search.games.GameState;

public class IksOksActionFunction implements ActionsFunction {

	// prima GameState a vraca listu akcija koje su moguce	
	@Override
	public List<Action> actions(Object s) {
		GameState gs = (GameState) s;
		
		List<Action> l = new ArrayList<>();
		
		IksOksBoard b = (IksOksBoard) gs.getBoard();
		String p = (String) gs.getPlayerToMove();
		
		for (XYLocation xy : b.getEmptyPositions()) {
			l.add(new IksOksAction(xy, p));
		}
		
		return l;
	}

}
