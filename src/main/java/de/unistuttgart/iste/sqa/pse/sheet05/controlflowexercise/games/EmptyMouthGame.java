package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.BaseControlFlowHamsterGame;

public class EmptyMouthGame extends BaseControlFlowHamsterGame {

    public EmptyMouthGame(String territoryFile) {
        super(territoryFile);
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        super.run();

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