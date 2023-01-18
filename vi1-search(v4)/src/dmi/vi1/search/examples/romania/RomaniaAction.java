package dmi.vi1.search.examples.romania;

import dmi.vi1.search.framework.Action;

public class RomaniaAction implements Action {
	
	private String toCity;

	@Override
	public String toString() {
		return "RomaniaAction [toCity=" + toCity + "]";
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public RomaniaAction(String toCity) {
		super();
		this.toCity = toCity;
	}

	@Override
	public boolean isNoOpAction() {
		// TODO Auto-generated method stub
		return false;
	}

}
