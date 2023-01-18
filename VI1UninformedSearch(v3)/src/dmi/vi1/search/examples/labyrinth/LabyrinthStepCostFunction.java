package dmi.vi1.search.examples.labyrinth;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.StepCostFunction;

public class LabyrinthStepCostFunction implements StepCostFunction {

	@Override
	public double c(Object s, Action a, Object s1) {
		LabyrinthState state = (LabyrinthState) s1;
		if(Labyrinth.MAP[state.getRow()][state.getColumn()].equals(Labyrinth.D)) {
			return 3;
		}
		return 1;
	}

}
