package dmi.vi1.search.examples.iksoks;

import dmi.vi1.search.games.Game;
import dmi.vi1.search.games.GameState;
import static dmi.vi1.search.examples.iksoks.IksOksBoard.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import dmi.vi1.search.datastructure.XYLocation;
import dmi.vi1.search.framework.Action;

public class IksOksGame extends Game {

	public IksOksGame() {
		gameResultFunction = new IksOksResultFunction();
		gameActionsFunction = new IksOksActionFunction();
	}
	
	@Override
	protected int computeUtility(GameState state) {
		
		IksOksBoard b = (IksOksBoard) state.getBoard();
		
		if (b.someoneWon()) {
			if (state.getPlayerToMove().equals(X))
				// x je na potezu, a terminalno stanje => o pobedio
				return -1;
			else
				return 1;
		}		
		// nereseno
		return 0;
	}

	@Override
	protected boolean terminalTest(GameState state) {
		return ((IksOksBoard)state.getBoard()).isTerminalState();
	}
	
	private static void printWinner(IksOksGame game, GameState s) {
		int score = game.computeUtility(s);
		if(score == 1) {
			System.out.println("PC je pobedio!");
		} else if(score == -1){
			System.out.println("Cestitamo pobedili ste!");
		} else {
			System.out.println("Nereseno je.");
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		IksOksGame iksoks = new IksOksGame();
		
		String player = IksOksBoard.X;
		IksOksBoard b = new IksOksBoard(new String[] {
			EMPTY, EMPTY, EMPTY,
			EMPTY, EMPTY, EMPTY,
			EMPTY, EMPTY, EMPTY
		});
		
		GameState s = new GameState(player, b);
		
		while (true) {			
			Action a = iksoks.minimaxDecision(s);
			s = iksoks.makeMove(s, a);
			System.out.println(a);
			System.out.println(s);
			
			if (iksoks.terminalTest(s)) {
				printWinner(iksoks, s);
				break;	
			}
						
			int x = 0, y = 0;
			List<Action> possibleActions = iksoks.getPossibleMoves(s);
			do {
				System.out.println("Unesite x koordinatu:");
				x = Integer.parseInt(bf.readLine());
				System.out.println("Unesite y koordinatu:");
				y = Integer.parseInt(bf.readLine());
				XYLocation position = new XYLocation(x, y);
				a = new IksOksAction(position, O);
			} while(!possibleActions.contains(a));

			s = iksoks.makeMove(s, a);
			System.out.println(s);
			
			if (iksoks.terminalTest(s)) {
				printWinner(iksoks, s);
				break;		
			}
		}	

	}

}
