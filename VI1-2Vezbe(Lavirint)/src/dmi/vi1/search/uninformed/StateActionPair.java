package dmi.vi1.search.uninformed;

import dmi.vi1.search.framework.Action;

public class StateActionPair {
	private Object state;
	private Action action;
	
	public StateActionPair(Object state, Action action) {
		super();
		this.state = state;
		this.action = action;
	}
	public Object getState() {
		return state;
	}
	public void setState(Object state) {
		this.state = state;
	}
	
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
}
