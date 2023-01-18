package dmi.vi1.search.examples.romania;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;

public class RomaniaActionFunction implements ActionsFunction {

	@Override
	public List<Action> actions(Object s) {
// TODO Auto-generated method stub

		List<Action> actions = new ArrayList<Action>();
		RomaniaState rs =(RomaniaState) s;
		String currCity = rs.getCity();
		
		for(TwoCityConnection tcc: RomanianMap.connected) {
			
			if(tcc.getCity1().equals(currCity)) {
				actions.add(new RomaniaAction(tcc.getCity2()));
			}
			if(tcc.getCity2().equals(currCity)) {
				actions.add(new RomaniaAction(tcc.getCity1()));
			}
		}
		return actions;
	
	}

}
