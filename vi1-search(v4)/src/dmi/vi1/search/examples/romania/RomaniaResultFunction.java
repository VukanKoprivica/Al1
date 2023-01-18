package dmi.vi1.search.examples.romania;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ResultFunction;

public class RomaniaResultFunction implements ResultFunction {

	@Override
	public Object result(Object s, Action a) {
		// TODO Auto-generated method stub
		
		RomaniaState rs =(RomaniaState)s;
		RomaniaAction ra= (RomaniaAction)a;
		
		String nextCity = ra.getToCity();
		
		RomaniaState newState= new RomaniaState(nextCity);
		return newState;
	}

}
