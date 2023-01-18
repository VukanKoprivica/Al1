package dmi.vi1.search.examples.fourinarow;

import dmi.vi1.search.framework.Action;

public class FIARAction implements Action {
	
	private int mark;
	private int Xlocation;
	
	

	public FIARAction(int mark, int xlocation) {
		super();
		this.mark = mark;
		Xlocation = xlocation;
	}
	



	public int getMark() {
		return mark;
	}




	public void setMark(int mark) {
		this.mark = mark;
	}




	public int getXlocation() {
		return Xlocation;
	}




	public void setXlocation(int xlocation) {
		Xlocation = xlocation;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Xlocation;
		result = prime * result + mark;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FIARAction other = (FIARAction) obj;
		if (Xlocation != other.Xlocation)
			return false;
		if (mark != other.mark)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "FIARAction [mark=" + mark + ", Xlocation=" + Xlocation + "]";
	}




	@Override
	public boolean isNoOpAction() {
		// TODO Auto-generated method stub
		return false;
	}

}
