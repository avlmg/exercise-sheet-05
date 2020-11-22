package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise05.praesenz;

import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.SimpleHamsterGame;


/**
 * Ein Hamsterspiel, um die Kontrollflussstrukturen zu testen.
 *
 * @author [Name u. Matrikelnummer]
 */
public class ControlFlowHamsterGame extends SimpleHamsterGame {
    
    /**
     * Startet das Spiel mit einem vorgefertigtem Territory.
     */
    @Override
    protected void run() {
        this.loadTerritoryFromResourceFile("/territories/territoryExample05.ter");
        this.displayInNewGameWindow();
        game.startGame();

       /*
        TODO: Hier kann man die Operationen aufrufen, um diese zu testen. Bitte NICHT die
        obigen Operationen veraendern!
        */
    }

    private void traverseTerritory() {
        /*
         * TODO: Aufgabe 2
         */
    }

    private void cleanTerritory() {
        /*
         * TODO: Aufgabe 2
         */
    }

    private void putGrains(int amountOfGrains) {
        /*
         * TODO: Aufgabe 2
         */
    }

    private void emptyMouth() {
        /*
         * TODO: Aufgabe 2
         */
    }
}
