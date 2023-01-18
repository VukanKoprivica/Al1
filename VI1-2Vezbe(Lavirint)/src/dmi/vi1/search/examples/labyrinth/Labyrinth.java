package dmi.vi1.search.examples.labyrinth;

public class Labyrinth {
	public static final String E = "-"; // Empty
	public static final String G = "G"; // Goal
	public static final String B = "B"; // Beast
	public static final String D = "D"; // Danger zone
	public static final String W = "W"; // Wall
	
	// mapa je staticka, pa nema potrebe da stavimo Herkulesa na nju
	
	public static final String[][] MAP = new String[][] {
		{ E, W, E, W, W, W, W, W },
		{ E, W, E, W, E, E, E, W },
		{ E, E, E, D, D, D, D, E },
		{ E, W, E, D, B, D, W, E },
		{ E, W, E, W, E, E, E, E },
		{ E, W, E, W, E, W, E, E },
		{ E, W, E, W, E, W, E, E },
		{ E, W, E, E, E, W, E, G }
	};
}
