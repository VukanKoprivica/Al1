package dmi.vi1.search.examples.romania;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;

public class RomanianMapActionsFunction implements ActionsFunction {

	// prima stanje, vraca listu akcija koje su moguce
	@Override
	public List<Action> actions(Object s) {
		
		List<Action> listActions = new ArrayList<>();
		
		RomanianMapState rms = (RomanianMapState) s;
		
		String inCity = rms.getCity(); // grad u kom se nalazimo
		
		// popuniti listu:
		
		for (TwoCityConnection tcc : RomanianMap.connected) {
			
			if (tcc.getCity1().equals(inCity)) {
				RomanianMapAction rma = new RomanianMapAction(tcc.getCity2());
				listActions.add(rma);
			} else if (tcc.getCity2().equals(inCity)) {
				RomanianMapAction rma = new RomanianMapAction(tcc.getCity1());
				listActions.add(rma);
			}  			
		}
		
		return listActions;
	}

}
