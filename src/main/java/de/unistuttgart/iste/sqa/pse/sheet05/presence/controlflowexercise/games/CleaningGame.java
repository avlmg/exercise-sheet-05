package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

public class CleaningGame extends BaseControlFlowHamsterGame {

    public CleaningGame() {
        super("/territories/territoryExample05-8.ter");
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        cleanTerritory();
    }
}
