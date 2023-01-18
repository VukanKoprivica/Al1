package dmi.vi1.search.examples.crypto;

import dmi.vi1.search.framework.Action;

public class CryptoAction implements Action {
	
	private String action;
	
	

	public CryptoAction(String action) {
		
		this.action = action;
	}



	@Override
	public String toString() {
		return "CryptoAction [action=" + action + "]";
	}



	public String getAction() {
		return action;
	}



	public void setAction(String action) {
		this.action = action;
	}



	@Override
	public boolean isNoOpAction() {
		// TODO Auto-generated method stub
		return false;
	}

}
