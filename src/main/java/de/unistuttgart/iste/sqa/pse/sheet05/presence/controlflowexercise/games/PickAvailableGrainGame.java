package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

public class PickAvailableGrainGame extends BaseControlFlowHamsterGame {

    public PickAvailableGrainGame() {
        super("/territories/territoryExample05-1.ter");
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {

        while(paule.frontIsClear()) {
            pickGrainIfAvailable();
            paule.move();
        }


    }
}
