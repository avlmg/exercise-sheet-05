package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

/**
 * This class contains the {@code main}-method, responsible for starting the game.
 * Do not modify!
 */
public class CleaningGameApp {
    public static void main(String[] args) {
        final CleaningGame game = new CleaningGame("/territories/territoryExample05-8.ter");
        game.doRun();
    }
}
