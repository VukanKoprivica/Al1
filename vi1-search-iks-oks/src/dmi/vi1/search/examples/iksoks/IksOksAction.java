/**
 * 
 */
package dmi.vi1.search.examples.iksoks;

import java.util.Objects;

import dmi.vi1.search.datastructure.XYLocation;
import dmi.vi1.search.framework.Action;

/**
 * @author Bojana Dimic Surla <bdimic@uns.ac.rs>
 *
 */
public class IksOksAction implements Action {

	private XYLocation xyLocation ;
	private String mark;
	
	
	public IksOksAction(XYLocation loc, String mark) {
		this.xyLocation = loc;
		this.mark = mark;
		
	}
	
	@Override
	public boolean isNoOpAction() {	
		return false;
	}

	/**
	 * @return the xyLocation
	 */
	public XYLocation getXyLocation() {
		return xyLocation;
	}

	/**
	 * @param xyLocation the xyLocation to set
	 */
	public void setXyLocation(XYLocation xyLocation) {
		this.xyLocation = xyLocation;
	}

	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	
	@Override
	public String toString() {	
		return "Action: Put "+mark+" to "+xyLocation.getPositionX()+","+xyLocation.getPositionY();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IksOksAction other = (IksOksAction) obj;
		return Objects.equals(mark, other.mark) && 
			   this.xyLocation.getPositionX() == other.xyLocation.getPositionX() &&
			   this.xyLocation.getPositionY() == other.xyLocation.getPositionY();
	}

	
	
	

}
