package ticTacToe;

/**
 * <h1>TicTacToe Logik- und Datenklasse </h1>
 * Diese Klasse beinhaltet alle Methoden und Daten, die für den Spielablauf des Spiels TicTacToe benoetigt werden. 
 * Auf einem quadratischen, 3×3 Felder großen Spielfeld setzen die beiden Spieler abwechselnd ihr Zeichen 
 * (ein Spieler Kreuze, der andere Kreise) in ein freies Feld. 
 * Der Spieler, der als Erster drei Zeichen in eine Zeile, Spalte oder Diagonale setzen kann, gewinnt. 
 * Wenn allerdings beide Spieler optimal spielen, kann keiner gewinnen, und es kommt zu einem Unentschieden. 
 * Das heißt, alle neun Felder sind gefüllt, ohne dass ein Spieler die erforderlichen Zeichen in einer Reihe, 
 * Spalte oder Diagonalen setzen konnte. 
 * 
 * @author Stephanie Boehning
 * @version 1.0
 */
public class SpieleLogik {
	private static final int SIZE = 3;
	private int [][] feld = new int [SIZE][SIZE];
	private boolean spieler1 = true;
	public static final int SPIELER_1 = 1;
	public static final int SPIELER_2 = 2;
	private boolean gameOver = false;
	private int gewinner = 0;

	/**
	 * Die Methode setSymbol versucht an der uebergebenen Position ein das Spielersymbol zu setzen. Dabei sieht das 3x3 Feld wie folgt aus:
	 * <br>| 0 | 1 | 2 |
	 * <br>| 3 | 4 | 5 |
	 * <br>| 6 | 7 | 8 |</br>
	 * <br>Mit den Indexen 0-8 koennen die jeweiligen Felder angegeben werden. Wenn das Symbol gesetzt werden kann, wird auch geprueft, 
	 * ob der Spieler das Spiel gewonnen hat. Mithilfe der Methoden isGameOver und getGewinner kann man pruefen, 
	 * ob das Spiel vorbei ist und wer der Gewinner ist.
	 * 
	 * @param position Als Parameter soll eine Zahl von 0-8 uebergeben werden. 
	 * @return true, wenn der Spieler eine gueltige Eingabe gemacht hat. False, wenn die uebergebene Zahl ungueltig oder schon vergeben ist
	 */
	public boolean setSymbol (int position) { 
		if (position >= SIZE * SIZE) {
			return false;
		}
		if (feld[position/SIZE][position%SIZE] == 0) {
			if (spieler1) {
				feld[position/SIZE][position%SIZE] = SPIELER_1;
			}
			else {
				feld[position/SIZE][position%SIZE] = SPIELER_2;							
			}
			
			if (hatGewonnen(spieler1? SPIELER_1 : SPIELER_2)) {
				gameOver = true;
				gewinner = spieler1? SPIELER_1 : SPIELER_2;
			}
			else if(isUnendschieden()) {
				gameOver = true;
				gewinner = 0;
			}
			spieler1 = !spieler1;
			
			return true;
		}
		return false;
	}
	
	private boolean hatGewonnen (int symbol) {
		//gucke ob alle Felder eine Reihe gleich sind
		for(int j = 0; j < SIZE; j++) {
			boolean gewonnen = true;
			for(int i = 0; i < SIZE; i++) {
				if (feld[j][i] != symbol) {
					gewonnen = false;
					break;
				}
			}
			if (gewonnen) {
				return true;
			}			
		}
		
		//gucke ob alle Felder eine Spalte gleich sind
		for(int j = 0; j < SIZE; j++) {
			boolean gewonnen = true;
			for(int i = 0; i < SIZE; i++) {
				if (feld[i][j] != symbol) {
					gewonnen = false;
					break;
				}
			}
			if (gewonnen) {
				return true;
			}			
		}
		
		//funktioniert nicht mehr für andere Felder!!!
		if (feld[0][0] == symbol && feld[1][1] == symbol && feld[2][2] == symbol) {
			return true;
		}
		
		if (feld[0][2] == symbol && feld[1][1] == symbol && feld[2][0] == symbol) {
			return true;
		}

		//Varianten fuer groeßeres Spielfeld
		//Diagonale links unten nach rechts oben
//		for(int j = SIZE-1; j >= 0; j--) {
//			boolean gewonnen = true;
//			for(int i = 0; i < SIZE; i++) {
//				if (feld[i][j] != symbol) {
//					gewonnen = false;
//					break;
//				}
//			}
//			if (gewonnen) {
//				return true;
//			}			
//		}
//
//		//Diagonale links oben nach rechts unten
//		boolean gewonnen = true;
//		for(int i = 0; i < SIZE; i++) {
//			if (feld[i][i] != symbol) {
//				gewonnen = false;
//				break;
//			}
//		}
//
//		if (gewonnen) {
//			return true;
//		}	
		return false;
	}

	private boolean isUnendschieden () {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (feld[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Die Methode setzt das Spiel zurueck und startet ein neues. Beim ersten Spiel startet der Spieler 1. 
	 * Falls es schon ein Spiel gab, beginnt der Verlierer des letzten Spiels. Bei einem Unendschieden bleibt die Reihenfolge erhalten.
	 */
	public void reset () {
		feld = new int [SIZE][SIZE];
		gameOver = false;
		
		if (gewinner == SPIELER_1) {
			spieler1 = false;
		} else if (gewinner == SPIELER_2) {
			spieler1 = true;
		}
		gewinner = 0;
	}
	
	/**
	 * Die Methode gibt 1 fuer den Spieler 1 zurueck und eine 2 fuer den Spieler 2.
	 * @return 1 oder 2
	 */
	public int aktuellerSpieler () {
		return spieler1 ? SPIELER_1 : SPIELER_2;
	}
	
	/**
	 * Gibt das aktuelle Spielfeld mit 3x3 Feldern, bestehend aus 0, 1, 2 zurueck. 0 steht fuer ein Feld, dass noch leer ist, 1 fuer das Symbol von Spieler 1 
	 * und eine 2 fuer das Symbol von Spieler 2
	 * @return int [][] eine nxn Matrix
	 */
	public int[][] getFeld() {
		return feld;
	}
	
	/**
	 * @return true, wenn das Spiel vorbei ist und false, wenn noch keiner gewonnen hat oder es unendschieden ist.
	 */
	public boolean isGameOver() {
		return gameOver;
	}
	
	/**
	 * 
	 * @return gibt 0 zurueck, wenn noch keiner gewonnen hat oder es unendschieden ist, 1 fuer Spieler 1 und 2 fuer Spieler 2.
	 */
	public int getGewinner() {
		return gewinner;
	}
}
