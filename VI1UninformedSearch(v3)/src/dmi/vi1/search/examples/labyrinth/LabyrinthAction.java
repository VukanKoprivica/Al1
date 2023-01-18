package dmi.vi1.search.examples.labyrinth;

import dmi.vi1.search.framework.Action;

public class LabyrinthAction implements Action {
	private Direction direction;

	@Override
	public String toString() {
		return "LabyrinthAction [direction=" + direction + "]";
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public LabyrinthAction(Direction direction) {
		super();
		this.direction = direction;
	}

	@Override
	public boolean isNoOpAction() {
		return false;
	}
	
	
}
