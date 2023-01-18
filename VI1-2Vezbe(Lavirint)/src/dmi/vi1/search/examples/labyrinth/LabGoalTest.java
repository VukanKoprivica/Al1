package dmi.vi1.search.examples.labyrinth;

import dmi.vi1.search.framework.GoalTest;

public class LabGoalTest implements GoalTest {

	static int poseta=0;
	@Override
	public boolean isGoalState(Object state) {
		// TODO Auto-generated method stub
		poseta++;
		LabState s = (LabState)state;
		return (Labyrinth.MAP[s.getColumn()][s.getRow()].equals(Labyrinth.G));
	}

}
