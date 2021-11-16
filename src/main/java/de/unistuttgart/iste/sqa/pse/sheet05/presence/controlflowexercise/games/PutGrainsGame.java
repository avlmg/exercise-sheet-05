package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

public class PutGrainsGame extends BaseControlFlowHamsterGame {

    public PutGrainsGame() {
        super("/territories/territoryExample05-6.ter");
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        while(paule.frontIsClear()) {
            while(paule.grainAvailable()) {
                paule.pickGrain();
            }
            paule.move();
        }
        putGrains(4);
    }
}
