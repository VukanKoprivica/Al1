package dmi.vi1.search.examples.labyrinth;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;

import static dmi.vi1.search.examples.labyrinth.Labyrinth.*;

public class LabyrinthActionsFunction implements ActionsFunction {

	@Override
	public List<Action> actions(Object s) {
		LabyrinthState ls = (LabyrinthState) s;
		List<Action> listActions = new ArrayList<>();
		
		int r = ls.getRow();
		int c = ls.getColumn();
		
		if (r - 1 >= 0 	&& (MAP[r - 1][c].equals(E)	|| MAP[r - 1][c].equals(G) || MAP[r - 1][c].equals(D)))
			listActions.add(new LabyrinthAction(Direction.UP));
		if (r + 1 < MAP.length 	&& (MAP[r + 1][c].equals(E)	|| MAP[r + 1][c].equals(G) || MAP[r + 1][c].equals(D)))
			listActions.add(new LabyrinthAction(Direction.DOWN));
		if (c - 1 >= 0 	&& (MAP[r][c - 1].equals(E)	|| MAP[r][c - 1].equals(G) || MAP[r][c - 1].equals(D)))
			listActions.add(new LabyrinthAction(Direction.LEFT));
		if (c + 1 < MAP.length 	&& (MAP[r][c + 1].equals(E)	|| MAP[r][c + 1].equals(G) || MAP[r][c + 1].equals(D)))
			listActions.add(new LabyrinthAction(Direction.RIGHT));
		
		return listActions;
	}

}
