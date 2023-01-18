package dmi.vi1.search.examples.labyrinth;

public class LabyrinthState {
	private int row, column;

	public LabyrinthState(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return "LabyrinthState [row=" + row + ", column=" + column + "]";
	}

	// hashCode i equals metodi su potrebni 
	// kada se koristi Graph Search jer se 
	// pamte posećena stanja
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + column;
		result = prime * result + row;
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
		LabyrinthState other = (LabyrinthState) obj;
		if (column != other.column)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	
	
}
