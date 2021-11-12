package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

/**
 * This class contains the {@code main}-method, responsible for starting the game.
 * Do not modify!
 */
public class MultiMoveGameApp {
    public static void main(String[] args) {
        final MultiMoveGame game = new MultiMoveGame("/territories/territoryExample05-3.ter");
        game.doRun();
    }
}
