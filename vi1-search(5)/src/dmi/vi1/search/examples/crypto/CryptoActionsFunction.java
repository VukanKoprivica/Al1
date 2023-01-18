package dmi.vi1.search.examples.crypto;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;

public class CryptoActionsFunction implements ActionsFunction {

	@Override
	public List<Action> actions(Object s) {
		// TODO Auto-generated method stub
		CryptoState state = (CryptoState)s;
		List<Action> actions = new ArrayList<Action>();
		
		
		if (state.getDay()<10) {
			if (state.getRsd() > state.getPriceForDay(state.getDay()+1))
				actions.add(new CryptoAction("buy"));
			if (state.getCoin() > 0)
				actions.add(new CryptoAction("sell"));
			actions.add(new CryptoAction("wait"));
		}
		return actions;
	}

}
