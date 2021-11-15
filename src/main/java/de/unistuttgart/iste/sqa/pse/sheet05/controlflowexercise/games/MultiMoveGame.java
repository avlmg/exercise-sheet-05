package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.BaseControlFlowHamsterGame;

public class MultiMoveGame extends BaseControlFlowHamsterGame {

    public MultiMoveGame() {
        super("/territories/territoryExample05-3.ter");
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        multiMove(5);
        multiMove(7);
    }
}
