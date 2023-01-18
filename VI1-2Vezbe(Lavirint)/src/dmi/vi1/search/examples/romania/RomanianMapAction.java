package dmi.vi1.search.examples.romania;

import dmi.vi1.search.framework.Action;

public class RomanianMapAction implements Action {

	private String toCity;
	
	
	
	@Override
	public String toString() {
		return "RomanianMapAction [toCity=" + toCity + "]";
	}



	public String getToCity() {
		return toCity;
	}



	public void setToCity(String toCity) {
		this.toCity = toCity;
	}



	public RomanianMapAction(String toCity) {
		super();
		this.toCity = toCity;
	}



	@Override
	public boolean isNoOpAction() {
		return false;
	}

}
