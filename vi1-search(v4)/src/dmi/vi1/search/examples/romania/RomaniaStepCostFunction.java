package dmi.vi1.search.examples.romania;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.StepCostFunction;

public class RomaniaStepCostFunction implements StepCostFunction {

	@Override
	public double c(Object s, Action a, Object s1) {
		// TODO Auto-generated method stub
		RomaniaState rs = (RomaniaState)s;
		RomaniaState rs1 = (RomaniaState)s1;
		
		String toCity = rs.getCity();
		String fromCity= rs1.getCity();
		
		for(TwoCityConnection tcc:RomanianMap.connected) {
			
			if(tcc.getCity1().equals(toCity) && tcc.getCity2().equals(fromCity)) {
				return tcc.getDistance();
			}
			if(tcc.getCity1().equals(fromCity) && tcc.getCity2().equals(toCity)) {
				return tcc.getDistance();
			}
		}
		System.out.println("Mrs");
		return 0.0;
	}

}
