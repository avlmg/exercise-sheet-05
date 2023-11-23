package de.unistuttgart.iste.sqa.pse.sheet05.homework;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.external.model.Hamster;
import de.hamstersimulator.objectsfirst.external.model.Territory;
import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * In this hamster-game {@code paule} gets four new friends.
 *
 * @author (Amores,Schneyinck)
 * @version (23.11.23)
 */
public class HamsterPartyGame extends SimpleHamsterGame {

	/**
	 * Creates {@code paule}s friends {@code adam}
	 * {@code eve}
	 * {@code erik}
	 * {@code lupin}
	 */
	void createPaulesFriends() {


		// Local variables for Adam
		Location locationAdam = Location.from(3, 6);
		Direction directionAdam = Direction.WEST;
		Territory territoryAdam = game.getTerritory();

		// Local variables for Eve
		Location locationEve = Location.from(5, 3);
		Direction directionEve = Direction.NORTH;
		Territory territoryEve = game.getTerritory();

		// Local variables for Erik
		Location locationErik = Location.from(2,3);
		Direction directionErik = Direction.SOUTH;
		Territory territoryErik = game.getTerritory();

		// Local variables for Lupin
		Location locationLupin = Location.from(3, 2);
		Direction directionLupin = Direction.EAST;
		Territory territoryLupin = game.getTerritory();

		Hamster Erik = new Hamster(territoryErik, locationErik, directionErik, 0);
		Hamster Lupin = new Hamster(territoryLupin, locationLupin, directionLupin, 0);
		Hamster Adam = new Hamster(territoryAdam, locationAdam, directionAdam, 0);
		Hamster Eve = new Hamster(territoryEve, locationEve, directionEve, 0);



	}

	/**
	 * Constructor for the Party Game.
	 */
	public HamsterPartyGame() {
		this.loadTerritoryFromResourceFile("/territories/territory-hamsterparty.ter");
		this.displayInNewGameWindow();
		game.startGame();
		createPaulesFriends();
	}

	/**
	 * Starts the HamsterPartyGame.
	 *
	 */
	protected void run() {

	}
}