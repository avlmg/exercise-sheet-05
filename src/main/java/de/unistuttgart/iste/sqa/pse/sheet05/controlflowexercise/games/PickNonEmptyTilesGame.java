package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.BaseControlFlowHamsterGame;

public class PickNonEmptyTilesGame extends BaseControlFlowHamsterGame {

    public PickNonEmptyTilesGame(String territoryFile) {
        super(territoryFile);
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {

        while(paule.frontIsClear()) {
            if(paule.grainAvailable()) {
                pickAllGrainsOnNonEmptyTile();
            }
            paule.move();
        }
    }
}
