/**
 * 
 */
package dmi.vi1.search.examples.eightpuzzle;

import dmi.vi1.search.framework.Action;

/**
 * @author Bojana Dimic Surla <bdimic@uns.ac.rs>
 *
 */
public class EightPuzzleAction implements Action {

	String direction;
	
	
	/**
	 * @param direction
	 */
	public EightPuzzleAction(String direction) {
		super();
		this.direction = direction;
	}


	@Override
	public boolean isNoOpAction() {
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Move gap "+direction;
	}

}
