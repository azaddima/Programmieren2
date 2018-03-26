package sport;

import hochschule.Person;

public class Spieler extends Person {

	private String position;
	private int anzahlTore;
	
	public Spieler(String firstname, String surname, String position, int anzahlTore) {
		super(firstname, surname);
		this.position = position;
		this.anzahlTore = anzahlTore;
	}
	
	public Spieler(String firstname, String surname) {
		this(firstname, surname, "Ersatzspieler", 0);
	}
	
	public int getAnzahlTore() {
		return anzahlTore;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void schiesstTor() {
		anzahlTore++;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (" + position + ") " + " hat " + anzahlTore + " Tore geschossen.";
	}
}
