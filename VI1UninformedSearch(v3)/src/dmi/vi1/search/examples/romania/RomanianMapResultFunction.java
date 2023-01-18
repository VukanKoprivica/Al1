package dmi.vi1.search.examples.romania;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ResultFunction;

public class RomanianMapResultFunction implements ResultFunction {

	// dobije stanje i akciju, vraca novo stanje
	// ne modifikujemo postojece stanje
	@Override
	public Object result(Object s, Action a) {
		
		RomanianMapState rms = (RomanianMapState) s;
		RomanianMapAction rma = (RomanianMapAction) a;
		
		// state je immutable!!!
		RomanianMapState newState = new RomanianMapState(rma.getToCity());
		
		return newState;
	}

}
