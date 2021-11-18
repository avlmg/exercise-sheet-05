package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

import java.util.Optional;

public class PutGrainsGame extends BaseControlFlowHamsterGame {

    public PutGrainsGame() {
        super("/territories/territoryExample05-6.ter", 2,4);
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     * Do not modify!
     */
    @Override
    protected void run() {
        while(paule.grainAvailable()) {
            paule.pickGrain();
        }

        for (int i = 0; i < 11; i++) {
            paule.move();
        }
        putGrains(randomParameters.get().get(0));
        putGrains(randomParameters.get().get(1));
    }
}
