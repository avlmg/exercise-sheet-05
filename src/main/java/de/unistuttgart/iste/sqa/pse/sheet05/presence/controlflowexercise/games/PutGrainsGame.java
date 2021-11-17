package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class PutGrainsGame extends BaseControlFlowHamsterGame {

    public PutGrainsGame() {
        super("/territories/territoryExample05-6.ter", Optional.of(2),Optional.of(4));
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        while(paule.grainAvailable()) {
            paule.pickGrain();
        }

        for (int i = 0; i < 11; i++) {
            paule.move();
        }
        putGrains(randomValues.get().get(0));
        putGrains(randomValues.get().get(1));
    }
}
