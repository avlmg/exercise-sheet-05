package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.BaseControlFlowHamsterGame;

public class PickAllGrainsGame extends BaseControlFlowHamsterGame {

    public PickAllGrainsGame() {
        super("/territories/territoryExample05-2.ter");
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {

        while(paule.frontIsClear()) {
            pickAllGrains();
            paule.move();
        }

    }
}
