package EngineNServer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

/**
 * Game that interfaces to an external Server to retrieve games
 * 
 * @author Marc Conrad
 *
 */
public class GServer {
	/**
	 * Retrieves a game for any positive number less than 1000.
	 * 
	 * @param i
	 * @return a random game.
	 * @throws MalformedURLException
	 */
	public MainGame getRandomGame() throws MalformedURLException {
		int i =  new Random().nextInt(1000); 
		String urlLocation = "https://sanfoh.com/heartgame/sixeqgame_" + i + ".png";
		URL url = new URL(urlLocation);
		int solution  = i % 10; 
		return new MainGame(url, solution);
	}


}

