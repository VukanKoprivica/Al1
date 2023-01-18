/**
 * 
 */
package dmi.vi1.search.examples.eightpuzzle;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.StepCostFunction;

/**
 * @author Bojana Dimic Surla <bdimic@uns.ac.rs>
 *
 */
public class EightPuzzleStepCostFunction implements StepCostFunction {

	
	@Override
	public double c(Object s, Action a, Object s1) {
		return 1;
	}

}
