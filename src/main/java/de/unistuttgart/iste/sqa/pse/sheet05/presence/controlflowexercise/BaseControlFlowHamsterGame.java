package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;


/**
 * A new HamsterGame to try out some control flow structures.
 *
 * @author (your name)
 * @version (version number or date)
 */
public abstract class BaseControlFlowHamsterGame extends SimpleHamsterGame {

    protected Optional<List<Integer>> randomValues;

    /**
     * Constructor for the BaseControlFlowHamsterGame class.
     * Provides the option to generate random values for use in game.
     *
     * @param territoryFile file-path to the .ter file specifying the game territory
     * @param numberOfValues optional amount of random values to generate
     * @param limit upper limit for random values(inclusive)
     */
    public BaseControlFlowHamsterGame(final String territoryFile, final Optional<Integer> numberOfValues,
            final Optional<Integer> limit) {
        this.loadTerritoryFromResourceFile(territoryFile);
        this.displayInNewGameWindow();
        this.randomValues = numberOfValues.isEmpty() ? Optional.empty() :
                generateRandomValues(numberOfValues.get(), limit.get());
        game.startGame();
    }

    /**
     * Helper method for generating random values
     * Generates an array of random numbers from 1 to the defined limit(inclusive).
     *
     * @param numberOfValues amount of random values to generate
     * @param limit upper limit for random values(inclusive)
     * @return List of random values, length depends on number of values
     */
    private Optional<List<Integer>> generateRandomValues(final int numberOfValues, Integer limit) {
        List<Integer> values = new LinkedList<>();
        for (int i = 0; i < numberOfValues; i++) {
            values.add(ThreadLocalRandom.current().nextInt(1, limit + 1));
        }
        return Optional.of(values);
    }

    /*
     * Please implement your solutions for exercise 2 into the following methods.
     * Remember to add the appropriate JavaDoc documentation and pre-post conditions for each operation
     * as well as the variants and loop invariants for any loops that are part of your implementation.
     */

    protected void pickGrainIfAvailable() {
        //TODO: Please implement according to exercise 2(b-i)
    }

    protected void pickAllGrains() {
        //TODO: Please implement according to exercise 2(b-ii)
    }

    protected void multiMove(Integer times) {
        //TODO: Please implement according to exercise 2(b-iii)
    }

    protected void pickGrainOrMove() {
        //TODO: Please implement according to exercise 2(b-iv)
    }

    protected void pickAllGrainsOnNonEmptyTile() {
        //TODO: Please implement according to exercise 2(b-v)
    }

    protected void putGrains(Integer amountOfGrains) {
        //TODO: Please implement according to exercise 2(e-i)
    }

    protected void emptyMouth() {
        //TODO: Please implement according to exercise 2(e-i)
    }

    protected void cleanTerritory() {
        //TODO: Please implement according to exercise 2(e-ii)/(e-iii)
    }

    public Optional<List<Integer>> getRandomValue() {
        return randomValues;
    }
}
