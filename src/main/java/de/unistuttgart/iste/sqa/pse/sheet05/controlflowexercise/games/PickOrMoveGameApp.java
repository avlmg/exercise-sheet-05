package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

/**
 * This class contains the {@code main}-method, responsible for starting the game.
 * Do not modify!
 */
public class PickOrMoveGameApp {

    public static void main(String[] args) {
        final PickOrMoveGame game = new PickOrMoveGame("/territories/territoryExample05-4.ter");
        game.doRun();
    }
}
