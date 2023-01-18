package dmi.vi1.search.examples.labyrinth;

import dmi.vi1.search.framework.GoalTest;

public class LabyrinthGoalTest implements GoalTest {

	static int visited = 0;
	
	@Override
	public boolean isGoalState(Object state) {
		visited ++;
		LabyrinthState ls = (LabyrinthState) state;		
		return Labyrinth.MAP[ls.getRow()][ls.getColumn()].equals(Labyrinth.G);
	}

}
