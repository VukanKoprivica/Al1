package dmi.vi1.search.examples.tops;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;

public class TopsActionsFunction implements ActionsFunction {

	@Override
	public List<Action> actions(Object s) {
		// TODO Auto-generated method stub
		TopsState state =(TopsState)s;
		List<Action>list = new ArrayList<Action>();
		
		int[][] board = state.getBoard();
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(board[i][j]==1) {
					
					if(i>0 && board[i-1][j] ==0)list.add(new TopsAction(i,i-1,j,j));
					if(i<7 && board[i+1][j] ==0)list.add(new TopsAction(i,i+1,j,j));
					if(j>0 && board[i][j-1] ==0)list.add(new TopsAction(i,i,j,j-1));
					if(j<7 && board[i][j+1] ==0)list.add(new TopsAction(i,i,j,j+1));
					
				}
			}
		}
		
		return list;
	}

}
