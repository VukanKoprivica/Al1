package dmi.vi1.search.examples.labyrinth;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ResultFunction;

public class LabyrinthResultFunction implements ResultFunction {

	@Override
	public Object result(Object s, Action a) {
		LabyrinthState ls = (LabyrinthState) s;
		LabyrinthAction la = (LabyrinthAction) a;
		
		int row = ls.getRow();
		int column = ls.getColumn();
		
		switch (la.getDirection()) {
			case UP:
				row = row - 1;
				break;
			case DOWN:
				row = row + 1;
				break;
			case LEFT:
				column = column - 1;
				break;
			case RIGHT:
				column = column + 1;
				break;
		}
		
		return new LabyrinthState(row, column);
	}

}
