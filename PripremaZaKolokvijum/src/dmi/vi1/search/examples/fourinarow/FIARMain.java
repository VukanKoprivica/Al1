package dmi.vi1.search.examples.fourinarow;

import dmi.vi1.search.framework.Action;
import dmi.vi1.search.games.Game;
import dmi.vi1.search.games.GameState;

import static dmi.vi1.search.examples.fourinarow.FourInARowBoard.*;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class FIARMain extends Game {


	

	public FIARMain() {
		this.gameActionsFunction = new FIARActionFunction();
		this.gameResultFunction = new FIARResultFunction();
	}

	@Override
	protected int computeUtility(GameState state) {
		// TODO Auto-generated method stub
		if(((FourInARowBoard)state.getBoard()).someOneWon()) {
			if(state.getPlayerToMove().equals(((FourInARowBoard)state.getBoard()).RED_DOT)) {
				return -1;
			}else if( state.getPlayerToMove().equals(((FourInARowBoard)state.getBoard()).YELLOW_DOT)){
				return 1;
			}
		}
		return 0;
	}

	@Override
	protected boolean terminalTest(GameState state) {
		// TODO Auto-generated method stub
		return ((FourInARowBoard)state.getBoard()).isTerminalState();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException, Exception {
		// TODO Auto-generated method stub
		
		
		
		FIARMain game  = new FIARMain();
		FourInARowBoard board = new FourInARowBoard(new int [][]{
				{EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY},
				{EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY},
				{EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY},
				{EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY}
				});
		GameState gameState= new GameState(RED_DOT,board);
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
			Action a = game.minimax(gameState);
			gameState =game.makeMove(gameState, a);
			Thread.sleep(1000);
			System.out.printf("%10s",gameState.getBoard());
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
		
			if(game.terminalTest(gameState)) {
				break;
			}
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
			a = game.minimaxDecision2(gameState);
			gameState =game.makeMove(gameState, a);
			Thread.sleep(1000);
			System.out.printf("%10s",gameState.getBoard());
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
		
			if(game.terminalTest(gameState)) {
				break;
			}
			
			
			
			
		}
		
		switch (game.computeUtility(gameState)) {
		case 1:{
				System.out.println("PC pobedio");
				break;
			}
		case -1:{
				System.out.println("Igrac pobedio");
				break;
		}
		case 0:{
				System.out.println("nereseno");
				break;
		}
		default:
			break;
		}
		
		
		

	}

}
