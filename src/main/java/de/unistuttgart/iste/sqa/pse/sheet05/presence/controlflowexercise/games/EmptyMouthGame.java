package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

public class EmptyMouthGame extends BaseControlFlowHamsterGame {

    public EmptyMouthGame() {
        super("/territories/territoryExample05-7.ter");
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        while(paule.frontIsClear()) {
            if(paule.grainAvailable()) {
                while(paule.grainAvailable()) {
                    paule.pickGrain();
                }
            }
            paule.move();
        }
        emptyMouth();
    }
}