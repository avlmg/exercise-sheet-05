package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * A new HamsterGame to try out some control flow structures.
 *
 * @author (your name)
 * @version (version number or date)
 */
public abstract class BaseControlFlowHamsterGame extends SimpleHamsterGame {

	/**
	 * Constructor for the BaseControlFlowHamsterGame class.
	 * Do not modify!
	 *
	 * @param territoryFile file-path to the .ter file specifying the game territory
	 */
	public BaseControlFlowHamsterGame(final String territoryFile) {
		this.loadTerritoryFromResourceFile(territoryFile);
		this.displayInNewGameWindow();
		game.startGame();
	}

	/*
	 * Please implement your solutions for exercise 2 into the following methods.
	 * Remember to add the appropriate JavaDoc documentation and pre-post conditions for each operation
	 * as well as the variants and loop invariants for any loops that are part of your implementation.
	 */

	protected void pickGrainIfAvailable() {
		// TODO: Please implement according to exercise 2(b-i)
	}

	protected void pickAllGrains() {
		// TODO: Please implement according to exercise 2(b-ii)
	}

	protected void multiMove(Integer times) {
		// TODO: Please implement according to exercise 2(b-iii)
	}

	protected void pickGrainOrMove() {
		// TODO: Please implement according to exercise 2(b-iv)
	}

	protected void pickAllGrainsOnNonEmptyTile() {
		// TODO: Please implement according to exercise 2(b-v)
	}

	protected void putGrains(Integer amountOfGrains) {
		// TODO: Please implement according to exercise 3(a)
	}

	protected void emptyMouth() {
		// TODO: Please implement according to exercise 3(b)
	}

	protected void cleanTerritory() {
		// TODO: Please implement according to exercise 3(c)/(d)
	}
}
