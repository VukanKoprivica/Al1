package dmi.vi1.search.examples.romania;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.StepCostFunction;

public class RomanianMapStepCostFunction implements StepCostFunction {

	// prima trenutno stanje, akciju i buduce stanje
	
	@Override
	public double c(Object s, Action a, Object s1) {
		
		String fromCity = ((RomanianMapState) s).getCity();
		String toCity = ((RomanianMapState) s1).getCity();
		
		for (TwoCityConnection tcc : RomanianMap.connected) {
			if (tcc.getCity1().equals(fromCity) && tcc.getCity2().equals(toCity))
				return tcc.getDistance();
			if (tcc.getCity2().equals(fromCity) && tcc.getCity1().equals(toCity))
				return tcc.getDistance();			
		}
		
		System.out.println("WARN: nisam nasao gradove");
		return 1;
	}

}
