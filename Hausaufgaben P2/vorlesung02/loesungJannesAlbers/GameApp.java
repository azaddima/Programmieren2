package loesungJannesAlbers;

public class GameApp  {

	public void bla () {
		System.out.println("bla");
	}
	
	public static void main(String[] args) {
		GameApp app = new GameApp();
		app.bla();

		//Spiel initialisieren.
		Game.initialisierung();
	      
	      
	      //Schleife für Spielvorgang:
	      do {
	    	 Game.spielzug(Game.aktuellerspieler); //Eingabe der Daten eines Spieler, der an der Reihe ist.
	    	 Game.spielaktualisieren(Game.aktuellerspieler, Game.aktuellereihe, Game.aktuellespalte); //Prüfung vornehmen (Ob Gewonnen oder alle Felder belegt)
	    	 SpieleAusgabe.feldausgeben();

	         if (Game.status == Game.spieler1_gewonnen) {
	            System.out.println("X hat gewonnen!");
	         } else if (Game.status == Game.spieler2_gewonnen) {
	            System.out.println("O hat gewonnen!");
	         } else if (Game.status == Game.alle_belegt) {
	            System.out.println("Unentschieden. Alle Felder belegt!");
	         }
	         //Spieler wechseln!
	         Game.aktuellerspieler = (Game.aktuellerspieler == Game.spieler1) ? Game.spieler2 : Game.spieler1;
	      } while (Game.status == Game.spielen); //Schleife solange, bis sich Spielstatus ändert.
	}
}
