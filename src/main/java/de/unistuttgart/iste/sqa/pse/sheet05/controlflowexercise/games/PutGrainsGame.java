package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.BaseControlFlowHamsterGame;

public class PutGrainsGame extends BaseControlFlowHamsterGame {

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
        this.loadTerritoryFromResourceFile("/territories/territoryExample05-6.ter");
        this.displayInNewGameWindow();
        game.startGame();

        while(paule.frontIsClear()) {
            while(paule.grainAvailable()) {
                paule.pickGrain();
            }
            paule.move();
        }
        putGrains(4);
    }
}
