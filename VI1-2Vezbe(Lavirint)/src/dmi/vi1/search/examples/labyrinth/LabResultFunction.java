package dmi.vi1.search.examples.labyrinth;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ResultFunction;

public class LabResultFunction implements ResultFunction {

	@Override
	public Object result(Object s, Action a) {
		// TODO Auto-generated method stub
		LabState state = (LabState)s;
		LabAction action = (LabAction)a;
		int row = state.getRow();
		int column=state.getColumn();
		
		switch (action.getD()) {
		case UP: {
			column=column-1;
			
		}case DOWN: {
			column=column+1;
			
		}case LEFT: {
			row=row-1;
			
		}case RIGHT: {
			row=row+1;
			
		}
		
		}
		
		return new LabState(row, column);
	}

}
