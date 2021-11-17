package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

import java.util.Optional;

public class MultiMoveGame extends BaseControlFlowHamsterGame {

    public MultiMoveGame() {
        super("/territories/territoryExample05-3.ter", Optional.of(2), Optional.of(6));
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        multiMove(getRandomValue().get().get(0));
        multiMove(getRandomValue().get().get(1));
    }
}
