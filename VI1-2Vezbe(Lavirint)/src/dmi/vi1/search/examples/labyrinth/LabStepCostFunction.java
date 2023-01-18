package dmi.vi1.search.examples.labyrinth;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.StepCostFunction;

public class LabStepCostFunction implements StepCostFunction {

	@Override
	public double c(Object s, Action a, Object s1) {
		
		LabState state = (LabState)s;
		if(Labyrinth.MAP[state.getColumn()][state.getRow()].equals(Labyrinth.D))return 3;
		
		return 1;
	}

}
