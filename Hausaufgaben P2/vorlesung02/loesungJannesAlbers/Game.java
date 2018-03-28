package loesungJannesAlbers;

import java.util.Scanner;

public class Game {
	//Scanner initialisieren.
	public static Scanner in = new Scanner(System.in) ; 
	
	//Feldgr��e w�hlen und setzten.
	public static int setfeldgroesse() {
		System.out.println("Bitte geben Sie die Gr��e des Spielfeldes ein (zB.3 f�r 3x3 oder 4 f�r 4x4):");
		int feldgroesseinput = in.nextInt() ;
		return feldgroesseinput ;
	}
	
	//Feldgr��e des Spieles.
	protected static int feldgroesse = setfeldgroesse() ;
	   
	//Erstellen des Arrays f�r die Spielfelder. 
	protected static int[][] feld = new int[feldgroesse][feldgroesse] ; 
	
	
	//Nummern f�r die Spieler und Leerfelder.
	protected static final int keinspieler = 0 ;
	protected static final int spieler1 = 1 ;
	protected static final int spieler2 = 2 ;
 
	//Nummern f�r die verschiedenen Status.
	protected static final int spielen = 0 ;
	protected static final int alle_belegt = 1 ;
	protected static final int spieler1_gewonnen = 2 ;
	protected static final int spieler2_gewonnen = 3 ;
                                                   
	//Aktueller Status des Spiels.
	protected static int status ; 
	
	//Zwischenspeicher des Spiels.                                
	protected static int aktuellerspieler ; //Wer ist der aktuelle Spieler.
	protected static int aktuellereihe ; //Aktuell gesetzte Reihe.
	protected static int aktuellespalte ; //Aktuell gesetzte Spalte.
   
	
	//Spielfeld initialisieren und alle Felder auf "Kein Spieler" setzen.
	public static void initialisierung() {
		for (int reihe = 0; reihe < feldgroesse; ++reihe) {
			for (int spalte = 0; spalte < feldgroesse; ++spalte) {
				feld[reihe][spalte] = keinspieler;  
			}
		}
		//Spiel starten mit Spieler 1
		status = spielen; 
		aktuellerspieler = spieler1;  
	}
	

	
 
	//Spielzug abgeben und verarbeiten. Spieler setzt sein Feld und es wird direkt gepr�ft, ob die Eingabe g�tlig ist.
	public static void spielzug(int gesetzt) {
		boolean InputFehler = false;  
		do {
			if (gesetzt == spieler1) {
				System.out.print("Spieler X, bitte das Feld w�hlen ("+ 1 +"-" + feldgroesse*feldgroesse +"): ");
			} else {
				System.out.print("Spieler O, bitte das Feld w�hlen ("+ 1 +"-" + feldgroesse*feldgroesse +"): ");
			}
			int auswahl = in.nextInt() - 1; //Eingabe der Feldnummer (1-9).
			int reihe = auswahl/feldgroesse ;  //Errechnung der richtigen Reihe.
			int spalte = auswahl%feldgroesse ; //Errechnung der richtigen Spalte.
         
			//Pr�fen, ob das Feld schon belegt ist. 
			if (reihe >= 0 && reihe < feldgroesse && spalte >= 0 && spalte < feldgroesse && feld[reihe][spalte] == keinspieler) {
				aktuellereihe = reihe;
				aktuellespalte = spalte;
				feld[aktuellereihe][aktuellespalte] = gesetzt;  //Neuen Eintrag in Feld schreiben. 
				//Eingabe war erfolgreich. Variable zur Beendung der Schleife true setzen.
				InputFehler = true;  
			} 
			else {
				System.out.println("Dieses Feld ist leider schon besetzt oder nicht im Spielfeld-Bereich. W�hlen Sie ein anderes!");
			}
		} while (!InputFehler); 
	}
 
	//Pr�fen, ob ein Spieler Gewonnen hat oder ob alle Spielfelder besetzt sind. Diese Funktion wird nach jedem Spielzug aufgrufen. 
	public static void spielaktualisieren(int gesetzt, int aktuellereihe, int aktuellespalte) {
		if (hatGewonnen(feld, feldgroesse, aktuellerspieler)) {  
			status = (gesetzt == spieler1) ? spieler1_gewonnen : spieler2_gewonnen;
		} 
		else if (allevoll()) {  
			status = alle_belegt;
		}
	}
	
   
   
	//Funktion zum Pr�fen, ob alle Felder besetzt sind.
	public static boolean allevoll() {
		for (int reihe = 0; reihe < feldgroesse; ++reihe) {
			for (int spalte = 0; spalte < feldgroesse; ++spalte) {
				if (feld[reihe][spalte] == keinspieler) {
					return false; 
				}
			}
		}
		return true; 
	}
 

	
	public static boolean hatGewonnen(int feld[][], int feldgroesse, int aktuellerspieler) {
    		  
    		  //Gewonnen in einer Reihe
				for(int z = 0;z < feldgroesse; z++){

					int feldz�hler = 0 ;

					for(int s = 0; s < feldgroesse; s++){
						if(feld[z][s] == aktuellerspieler){
							feldz�hler ++ ;
						}
					}
					if(feldgroesse == feldz�hler) {
						return true ;
					}
				}

              //Gewonnen in einer Spalte.
				for(int s = 0;s < feldgroesse; s++){

					int feldz�hler = 0 ;

					for(int z = 0; z < feldgroesse; z++){
						if(feld[z][s] == aktuellerspieler){
							feldz�hler ++ ;
						}
					}
					if(feldgroesse == feldz�hler) {
						return true ;
					}
				}
              
              //Gewonnen in einer Diagonalen.
				int feldz�hlerdiag = 0 ;

				for(int sz = 0; sz < feldgroesse; sz++){
					if(feld[sz][sz] == aktuellerspieler){
						feldz�hlerdiag ++ ;
					}
				}
				if(feldgroesse == feldz�hlerdiag) {
					return true ;
				}

              
              //Gewonnen in der entgegengesetzten Diagonalen.
				int s  = feldgroesse -1 ;
				int feldz�hler = 0 ;
				for(int z = 0;z < feldgroesse; z++){
					if(feld[z][s] == aktuellerspieler){
						feldz�hler ++ ;
					}
					s-- ;					
				}
				if(feldgroesse == feldz�hler) {
					return true ;
				}
				return false ;
	}
}
