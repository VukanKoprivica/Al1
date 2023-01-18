package dmi.vi1.search.examples.romania;

import dmi.vi1.search.framework.GoalTest;

public class RomanianMapGoalTest implements GoalTest {

	// dobije stanje, vrati boolean da li je ciljno stanje
	
	@Override
	public boolean isGoalState(Object state) {
		
		RomanianMapState rms = (RomanianMapState) state;
		
		return rms.getCity().equals("Bucharest");
	}

}
