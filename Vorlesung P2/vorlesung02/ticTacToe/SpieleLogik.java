package ticTacToe;


public class SpieleLogik {
	private static final int SIZE = 3;
	private int [][] feld = new int [SIZE][SIZE];
	private boolean spieler1 = true;
	private static final int SPIELER_1 = 1;
	private static final int SPIELER_2 = 2;
	
	public boolean setSymbol (int position) {
		if (feld[position/3][position%3] == 0) {
			if (spieler1) {
				feld[position/3][position%3] = SPIELER_1;
				spieler1 = false;
			}
			else {
				feld[position/3][position%3] = SPIELER_2;							
				spieler1 = true;
			}
			return true;
		}
		return false;
	}
	
	public boolean hatGewonnen (int symbol) {
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

		return false;
	}
}
