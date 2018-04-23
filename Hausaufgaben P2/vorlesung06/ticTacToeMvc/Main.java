package ticTacToeMvc;
import java.util.Scanner;

public class Main {

	private Scanner scan = new Scanner(System.in);
	private GameLogic spieleLogik = new GameLogic();
	
	private int eingabe () {
		System.out.println("Spieler " + spieleLogik.aktuellerSpieler() + " bitte geben Sie den Index für den nächsten Zug ein:");
		int index = scan.nextInt();			
		return index;
	}
	
	private void play () {
		ausgabe();
		while (true) {
			int index = 0;
			do {
				index = eingabe();
			} while (!spieleLogik.setSymbol(index));
			ausgabe();
			while (spieleLogik.isGameOver()) {
				System.out.println("Der Spieler " + spieleLogik.getGewinner() + " hat gewonnen. " + 
						"Möchten Sie ein neues Spiel starten? (Y/N)");
				String str = scan.next();
				if (str.equals("Y")) {
					spieleLogik.reset();
					ausgabe();
				} else if (str.equals("N")) {
					return;
				}
			}
		}
	}
	
	private void ausgabe () {
		for (int y = 0; y < spieleLogik.getFeld().length; y++) {
			for (int x = 0; x < spieleLogik.getFeld()[0].length; x++) {
				if (spieleLogik.getFeld()[y][x] == GameLogic.SPIELER_1) {
					System.out.print("|X");
				} else if (spieleLogik.getFeld()[y][x] == GameLogic.SPIELER_2) {
					System.out.print("|O");					
				} else {
					System.out.print("| ");					
				}
			}			
			System.out.println("|\n--------");
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.play();

	}

}
