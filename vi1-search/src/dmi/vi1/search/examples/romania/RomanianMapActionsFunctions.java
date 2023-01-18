/**
 * 
 */
package dmi.vi1.search.examples.romania;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;

/**
 * @author bdimic@uns.ac.rs
 *
 */
public class RomanianMapActionsFunctions implements ActionsFunction {

	/* (non-Javadoc)
	 * @see dmi.vi1.search.framework.ActionsFunction#actions(java.lang.Object)
	 */
	@Override
	public List<Action> actions(Object s) {
		
		List<Action> retVal = new ArrayList<Action>();
		for(TwoCityConnection tc:RomanianMap.connected){
			if(tc.getCity1().equals(s))
				retVal.add(new GoToCityAction(tc.getCity2()));
			if(tc.getCity2().equals(s))
				retVal.add(new GoToCityAction(tc.getCity1()));
			
		}
		return retVal;
	}

}
