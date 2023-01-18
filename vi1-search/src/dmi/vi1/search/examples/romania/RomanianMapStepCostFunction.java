/**
 * 
 */
package dmi.vi1.search.examples.romania;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.StepCostFunction;

/**
 * @author bdimic@uns.ac.rs
 *
 */
public class RomanianMapStepCostFunction implements StepCostFunction {

	
	public double c(Object s, Action a, Object s1) {	
		for(TwoCityConnection rtc:RomanianMap.connected){
			if(rtc.getCity1().equals(s) && rtc.getCity2().equals(s1))
				return rtc.getDistance();
			if(rtc.getCity1().equals(s1) && rtc.getCity2().equals(s))
				return rtc.getDistance();
		}
		return 0;
	}

}
