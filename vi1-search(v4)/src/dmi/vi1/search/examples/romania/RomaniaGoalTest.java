package dmi.vi1.search.examples.romania;

import dmi.vi1.search.framework.GoalTest;

public class RomaniaGoalTest implements GoalTest {

	@Override
	public boolean isGoalState(Object state) {
		// TODO Auto-generated method stub
		return ((RomaniaState) state).getCity().equals("Bucharest");
	}

}
