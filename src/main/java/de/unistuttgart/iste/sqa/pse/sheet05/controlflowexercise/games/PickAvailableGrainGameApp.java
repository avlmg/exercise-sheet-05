package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

/**
 * This class contains the {@code main}-method, responsible for starting the game.
 * Do not modify!
 */
public class PickAvailableGrainGameApp {

    public static void main(String[] args) {
        final PickAvailableGrainGame game = new PickAvailableGrainGame("/territories/territoryExample05-1.ter");
        game.doRun();
    }
}
