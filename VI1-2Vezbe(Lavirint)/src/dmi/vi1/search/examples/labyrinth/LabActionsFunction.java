package dmi.vi1.search.examples.labyrinth;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;

import static dmi.vi1.search.examples.labyrinth.Labyrinth.*;

public class LabActionsFunction implements ActionsFunction {

	@Override
	public List<Action> actions(Object s) {
		
		List<Action> listAction = new ArrayList<Action>();
		LabState state = (LabState)s;
		
		int r = state.getRow();
		int c = state.getColumn();
		
		if(r+1<8 && (MAP[r+1][c].equals(E) || MAP[r+1][c].equals(G) || MAP[r+1][c].equals(D)))
			listAction.add(new LabAction(Direction.RIGHT));
		if(c+1<8 && (MAP[r][c+1].equals(E) || MAP[r][c+1].equals(G) || MAP[r][c+1].equals(D)))
			listAction.add(new LabAction(Direction.DOWN));
		if(r-1>0 && (MAP[r-1][c].equals(E) || MAP[r-1][c].equals(G) || MAP[r-1][c].equals(D)))
			listAction.add(new LabAction(Direction.LEFT));
		if(c-1>0 && (MAP[r][c-1].equals(E) || MAP[r][c-1].equals(G) || MAP[r][c-1].equals(D)))
			listAction.add(new LabAction(Direction.UP));
		
		return listAction;
	}

}
