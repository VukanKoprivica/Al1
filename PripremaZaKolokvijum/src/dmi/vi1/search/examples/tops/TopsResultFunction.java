package dmi.vi1.search.examples.tops;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ResultFunction;

public class TopsResultFunction implements ResultFunction {

	@Override
	public Object result(Object s, Action a) {
		// TODO Auto-generated method stub
		TopsState state = (TopsState)s;
		TopsAction action = (TopsAction)a;
		TopsState clone = state.clone();
		
		clone.getBoard()[action.xLocation][action.yLocation]=0;
		clone.getBoard()[action.xLocation1][action.yLocation1]=1;
		
		
		
		return clone;
	}

}
