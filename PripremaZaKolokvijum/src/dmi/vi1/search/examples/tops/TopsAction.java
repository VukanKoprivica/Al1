package dmi.vi1.search.examples.tops;

import dmi.vi1.search.framework.Action;

public class TopsAction implements Action {
	
	int xLocation;
	int xLocation1;
	int yLocation;
	int yLocation1;
	
	public int getxLocation() {
		return xLocation;
	}

	public void setxLocation(int xLocation) {
		this.xLocation = xLocation;
	}

	public int getxLocation1() {
		return xLocation1;
	}

	public void setxLocation1(int xLocation1) {
		this.xLocation1 = xLocation1;
	}
	public int getyLocation() {
		return yLocation;
	}

	public void setyLocation(int yLocation) {
		this.yLocation = yLocation;
	}

	public int getyLocation1() {
		return yLocation1;
	}

	public void setyLocation1(int yLocation1) {
		this.yLocation1 = yLocation1;
	}

	public TopsAction(int xLocation, int xLocation1, int yLocation, int yLocation1) {
	
		this.xLocation = xLocation;
		this.xLocation1 = xLocation1;
		this.yLocation = yLocation;
		this.yLocation1 = yLocation1;
	}


	@Override
	public String toString() {
		return "TopsAction [xLocation=" + xLocation + ", xLocation1=" + xLocation1 + ", yLocation=" + yLocation
				+ ", yLocation1=" + yLocation1 + "]";
	}

	@Override
	public boolean isNoOpAction() {
		// TODO Auto-generated method stub
		return false;
	}

}
