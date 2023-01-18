package dmi.vi1.search.examples.iksoks;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ResultFunction;
import dmi.vi1.search.games.GameState;

public class IksOksResultFunction implements ResultFunction {

	@Override
	public Object result(Object s, Action a) {
		// TODO Auto-generated method stub
		GameState gs = (GameState)s;
		IksOksAction action = (IksOksAction)a;
		
		String n;
		if(action.getMark().equals(IksOksBoard.X)) {
			n=IksOksBoard.O;
		}else {
			n=IksOksBoard.X;
		}
		
		IksOksBoard board = ((IksOksBoard)gs.getBoard()).cloneBoard();
		
		board.mark(action.getPosition(), action.getMark());
		
		GameState game = new GameState(n, board);
		
		
		return game;
	}

}
