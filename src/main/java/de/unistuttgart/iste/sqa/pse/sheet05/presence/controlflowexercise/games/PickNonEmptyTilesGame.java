package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

import java.util.Optional;

public class PickNonEmptyTilesGame extends BaseControlFlowHamsterGame {

    public PickNonEmptyTilesGame() {
        super("/territories/territoryExample05-5.ter" , Optional.empty(), Optional.empty());
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        for (int i = 0; i < 13; i++) {
            if(paule.grainAvailable()) {
                pickAllGrainsOnNonEmptyTile();
            }
            paule.move();
        }
    }
}
