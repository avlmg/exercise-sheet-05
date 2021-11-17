package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

import java.util.Optional;

public class EmptyMouthGame extends BaseControlFlowHamsterGame {

    public EmptyMouthGame() {
        super("/territories/territoryExample05-7.ter", Optional.of(2), Optional.of(5));
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        for (int i = 0; i < getRandomValue().get().get(0); i++) {
            paule.pickGrain();
        }
        for (int i = 0; i < getRandomValue().get().get(1); i++) {
            paule.pickGrain();
        }
        for (int i = 0; i < 11; i++) {
            paule.move();
        }
        emptyMouth();
    }
}