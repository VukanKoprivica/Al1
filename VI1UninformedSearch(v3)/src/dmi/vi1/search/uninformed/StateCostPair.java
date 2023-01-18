package dmi.vi1.search.uninformed;

public class StateCostPair implements Comparable<StateCostPair>{
		private Object state;
		private double cost;
		
		public StateCostPair(Object state, double cost) {
			super();
			this.state = state;
			this.cost = cost;
		}

		public Object getState() {
			return state;
		}

		public void setState(Object state) {
			this.state = state;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		@Override
		public int compareTo(StateCostPair o) {
			// TODO Auto-generated method stub
			if(this.getCost() < o.getCost()) {
				return -1;
			} else if(this.getCost() > o.getCost()) {
				return 1;
			}
			return 0;
		}
		
		
		
}
