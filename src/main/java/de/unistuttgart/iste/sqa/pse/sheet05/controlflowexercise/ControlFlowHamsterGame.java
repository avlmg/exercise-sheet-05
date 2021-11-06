package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * A new HamsterGame to try out some control flow structures.
 *
 * @author (your name)
 * @version (version number or date)
 */
public class ControlFlowHamsterGame extends SimpleHamsterGame {
    
    /**
     * Starts the game with a predetermined territory.
     */
    @Override
    protected void run() {
        this.loadTerritoryFromResourceFile("/territories/territoryExample05.ter");
        this.displayInNewGameWindow();
        game.startGame();

       /*
        * Call your methods here, in order to test them.
        * Do not modify any other parts of this method.
        */
    }

    /*
     * Please implement your solutions for exercise 2 into the following methods.
     * Remember to add the appropriate JavaDoc documentation and pre-post conditions for each operation
     * as well as the variants and loop invariants for any loops that are part of your implementation.
     */

    private void pickGrainIfAvailable() {
        //TODO: Please implement according to exercise 2(b)
    }

    private void pickAllGrains() {
        //TODO: Please implement according to exercise 2(c)
    }

    private void multiMove(Integer times) {
        //TODO: Please implement according to exercise 2(d)
    }

    private void pickGrainOrMove() {
        //TODO: Please implement according to exercise 2(e)
    }

    private void pickAllGrainsOnNonEmptyTile() {
        //TODO: Please implement according to exercise 2(f)
    }

    private void cleanTerritory() {
        //TODO: Please implement according to exercise 2(i)/(k)
    }

    private void putGrains(Integer amountOfGrains) {
        //TODO: Please implement according to exercise 2(j)
    }

    private void emptyMouth() {
        //TODO: Please implement according to exercise 2(j)
    }
}
