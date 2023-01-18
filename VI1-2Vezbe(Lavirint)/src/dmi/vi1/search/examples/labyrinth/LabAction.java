package dmi.vi1.search.examples.labyrinth;

import dmi.vi1.search.framework.Action;

public class LabAction implements Action {
	
	private Direction d;
	

	@Override
	public String toString() {
		return "LabAction [d=" + d + "]";
	}


	public Direction getD() {
		return d;
	}


	public void setD(Direction d) {
		this.d = d;
	}


	public LabAction(Direction d) {
		super();
		this.d = d;
	}


	@Override
	public boolean isNoOpAction() {
		// TODO Auto-generated method stub
		return false;
	}

}
