package dmi.vi1.search.examples.iksoks;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ResultFunction;
import dmi.vi1.search.games.GameState;

public class IksOksResultFunction implements ResultFunction {

	// primamo GameState i IksOksAction
	// vracamo novi GameState
	// pazimo da kloniramo tablu!!!
	@Override
	public Object result(Object s, Action a) {
		GameState gs = (GameState) s;
		IksOksAction ia = (IksOksAction) a;
		
		String n;
		if (ia.getMark().equals(IksOksBoard.X))
			n = IksOksBoard.O;
		else
			n = IksOksBoard.X;
		
		IksOksBoard nb = ((IksOksBoard) gs.getBoard()).cloneBoard();
		
		nb.mark(ia.getXyLocation(), ia.getMark());		
		
		GameState ret = new GameState(n, nb);
		return ret;
	}

}
