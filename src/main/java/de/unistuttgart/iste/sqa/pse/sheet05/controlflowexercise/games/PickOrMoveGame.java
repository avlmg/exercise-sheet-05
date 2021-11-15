package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.BaseControlFlowHamsterGame;

public class PickOrMoveGame extends BaseControlFlowHamsterGame {

    public PickOrMoveGame() {
        super("/territories/territoryExample05-4.ter");
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {

        while(paule.frontIsClear()) {
            pickGrainOrMove();
        }
    }
}
