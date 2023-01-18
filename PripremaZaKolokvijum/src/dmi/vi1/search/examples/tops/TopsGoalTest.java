package dmi.vi1.search.examples.tops;

import dmi.vi1.search.framework.GoalTest;

public class TopsGoalTest implements GoalTest {

	@Override
	public boolean isGoalState(Object state) {
		// TODO Auto-generated method stub
		TopsState s = (TopsState)state;
		int[][] board = s.getBoard();
		int x=0,y=0;
		for(int i=0;i<8;i++) {
			x=0;y=0;
			for(int j=0;j<8;j++) {
				if(board[i][j]!=0)y++;
				if(board[j][i]!=0)x++;
			}
			if(x>1 || y>1)return false;
			
		}
		return true;
	}

}
