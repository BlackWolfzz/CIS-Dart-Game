package EngineNServer;

import java.net.URL;

public class MainGame {
	URL location = null;
	int solution = -1;

	/**
	 * Location of the game and what is the solution to the game.
	 * 
	 * @param location
	 * @param solution
	 */
	public MainGame(URL location, int solution) {
		super();
		this.location = location;
		this.solution = solution;
	}

	/**
	 * The location of the game.
	 * 
	 * @return the location of the game.
	 */
	public URL getLocation() {
		return location;
	}

	/**
	 * @return The solution of the game.
	 */
	public int getSolution() {
		return solution;
	}

}
