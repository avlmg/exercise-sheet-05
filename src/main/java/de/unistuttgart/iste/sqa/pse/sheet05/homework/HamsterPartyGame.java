package de.unistuttgart.iste.sqa.pse.sheet05.homework;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * In this hamster-game {@code paule} gets four new friends.
 *
 * @author AmoresSchneyinck
 * @version 23.11.2023
 */
public class HamsterPartyGame extends SimpleHamsterGame {

	/**
	 * Constructor for the Party Game.
	 */
	public HamsterPartyGame() {
		this.loadTerritoryFromResourceFile("/territories/territory-hamsterparty.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	public class Hamster {
		private String name;

		public Hamster(String name) {
			this.name = name;
		}

		public void display() {
			System.out.println("Ich bin der Hamster " + name);
		}

		public void placeOnFieldWithGrain() {
			System.out.println(name + " wurde auf ein Feld mit Korn platziert.");
			// Hier könnten Sie weitere Logik hinzufügen, um den Hamster auf einem Feld zu positionieren.
		}

		public boolean getName() {
		}
	}

	/**
	 * Starts the HamsterPartyGame.
	 */
	protected void run() {
		// Erzeugen von Hamster-Objekten
		Hamster adam = new Hamster("Adam");
		Hamster eve = new Hamster("Eve");

		// Platzieren der Hamster auf Feldern mit Korn
		placeHamsterOnFieldWithGrain(adam);
		placeHamsterOnFieldWithGrain(eve);
	}

	/**
	 * Platziert den Hamster auf einem Feld mit Korn.
	 *
	 * @param hamster Der Hamster, der platziert werden soll.
	 */
	private void placeHamsterOnFieldWithGrain(Hamster hamster) {
		// Hier könnten Sie die Logik hinzufügen, um den Hamster auf einem Feld mit Korn zu platzieren.
		// Beispiel: hamster.move(); oder hamster.grab();
		System.out.println(hamster.getName() + " wurde auf ein Feld mit Korn platziert.");
	}

	public static void main(String[] args) {
		new HamsterPartyGame().run();
	}
}

