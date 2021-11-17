package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

import java.util.Optional;

public class SecondaryPickOrMoveGame extends BaseControlFlowHamsterGame {

    public SecondaryPickOrMoveGame() {
        super("/territories/territoryExample05-4.2.ter", Optional.empty(), Optional.empty());
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        pickGrainOrMove();
    }
}