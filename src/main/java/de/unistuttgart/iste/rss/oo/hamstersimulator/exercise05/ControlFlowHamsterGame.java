package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise05;

import de.hamstersimulator.objectsfirst.external.model.SimpleHamsterGame;


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
        * TODO: Hier kann man die Operationen aufrufen, um diese zu testen. Bitte NICHT die
        *       obigen Operationsaufrufe veraendern!
        */
    }

    /*
     * In den folgenden Operationen implementieren Sie die Aussagen (i) - (v) der Aufgabe 2.
     * Vergessen Sie nicht, JavaDoc und Vor- und Nachbedingungen für die operationen zu schreiben.
     * Schreiben Sie ebenfalls FUER JEDE SCHLEIFE die SCHLEIFENINVARIANTEN und -VARIANTEN.
     */

    private void pickGrainIfAvailable() {

    }

    private void pickAllGrains() {

    }

    private void multiMove(Integer times) {

    }

    private void pickGrainOrMove() {

    }

    private void pickAllGrainsOnNonEmptyTile() {

    }

    private void cleanTerritory() {
        /*
         * TODO: Aufgabe 2
         */
    }

    private void putGrains(Integer amountOfGrains) {
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
