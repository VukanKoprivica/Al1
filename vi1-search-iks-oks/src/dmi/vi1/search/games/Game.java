/**
 * 
 */
package dmi.vi1.search.games;

import java.util.ArrayList;
import java.util.List;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.framework.ActionsFunction;
import dmi.vi1.search.framework.ResultFunction;

/**
 * @author Bojana Dimic Surla <bdimic@uns.ac.rs>
 *
 */
public abstract class Game {
	
		
	
	
	protected int maxDepth;
	
	protected ActionsFunction gameActionsFunction;
	
	protected ResultFunction gameResultFunction;
	
	
	
	public  List<Action> getPossibleMoves(GameState state){
		return gameActionsFunction.actions(state);
	}

	public GameState makeMove(GameState state, Action a){
		return (GameState)gameResultFunction.result(state, a);
	}
	
	
	protected abstract int computeUtility(GameState state);

	protected abstract boolean terminalTest(GameState state);
	
	public Action minimaxDecision(GameState state){
		int v = Integer.MIN_VALUE;	
		int alpha = Integer.MIN_VALUE;
		int beta = Integer.MAX_VALUE;
		Action bestAction = null;
		List<Action> actions = getPossibleMoves(state);
		for(Action a:actions){
			GameState successor = makeMove(state, a);
			//System.out.println(successor.getBoard());
			int newMin = minValue(successor, alpha, beta);
			//System.out.println(newMin);
			//System.out.println("---------");
			if(newMin>v){
				v=newMin;
				bestAction = a;
			}
			alpha = Math.max(alpha, v);
			if(beta <= alpha) {
				break;
			}
		}		
		return bestAction;		
	}
	
	
	// TODO depth
	// 
	public int maxValue(GameState state, int alpha, int beta){
		int v = Integer.MIN_VALUE;
		if(terminalTest(state)) return computeUtility(state);
		else{
			List<Action> actions = getPossibleMoves(state);
			for(Action a:actions){
				GameState successor = makeMove(state, a);
				int newMin = minValue(successor, alpha, beta);
				v = Math.max(v, newMin);
				alpha = Math.max(alpha, v);
				if(beta <= alpha) {
					break;
				}
			}
		}
		return v;		
	}
	
	// TODO depth
	//
	
	public int minValue(GameState state, int alpha, int beta){
		int v = Integer.MAX_VALUE;
		if(terminalTest(state)) return computeUtility(state);
		else{
			List<Action> actions = getPossibleMoves(state);
			for(Action a:actions){
				GameState successor = makeMove(state, a);
				int newMax = maxValue(successor, alpha, beta);
				v = Math.min(v, newMax);
				beta = Math.min(beta, v);
				if(beta <= alpha) {
					break;
				}
			}
		}
		return v;		
	}
	
}
