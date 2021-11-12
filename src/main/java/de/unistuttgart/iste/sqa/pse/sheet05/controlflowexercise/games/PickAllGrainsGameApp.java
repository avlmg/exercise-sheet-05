package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

/**
 * This class contains the {@code main}-method, responsible for starting the game.
 * Do not modify!
 */
public class PickAllGrainsGameApp {

    public static void main(String[] args) {
        final PickAllGrainsGame game = new PickAllGrainsGame("/territories/territoryExample05-2.ter");
        game.doRun();
    }
}
