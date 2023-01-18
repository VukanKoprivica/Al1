package dmi.vi1.search.examples.iksoks;

import dmi.vi1.search.framework.Action;

import java.util.Objects;

import dmi.vi1.search.datastructure.XYLocation;

public class IksOksAction implements Action {
	
	private XYLocation position;
	private String mark;
	
	

	


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
			   this.position.getPositionX() == other.position.getPositionX() &&
			   this.position.getPositionY() == other.position.getPositionY();
	}



	@Override
	public String toString() {
		return "IksOksFunction [position=" + position + ", mark=" + mark + "]";
	}



	public IksOksAction(XYLocation position, String mark) {
		super();
		this.position = position;
		this.mark = mark;
	}



	public XYLocation getPosition() {
		return position;
	}



	public void setPosition(XYLocation position) {
		this.position = position;
	}



	public String getMark() {
		return mark;
	}



	public void setMark(String mark) {
		this.mark = mark;
	}



	@Override
	public boolean isNoOpAction() {
		// TODO Auto-generated method stub
		return false;
	}

}
