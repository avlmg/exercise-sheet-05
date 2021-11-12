package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

/**
 * This class contains the {@code main}-method, responsible for starting the game.
 * Do not modify!
 */
public class PutGrainsGameApp {
    public static void main(String[] args) {
        final PutGrainsGame game = new PutGrainsGame("/territories/territoryExample05-6.ter");
        game.doRun();
    }
}
