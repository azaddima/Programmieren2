package sport;

import hochschule.Person;

public class Trainer extends Person{

	private int mitgliedsnummer;
	private static int mitgliedsnummerID = 0;
	
	public Trainer(String firstname, String surname) {
//		super(firstname, surname);
//		++mitgliedsnummerID;
//		mitgliedsnummer = mitgliedsnummerID;
		this (firstname, surname, ++mitgliedsnummerID, 0);
	}

	public Trainer(String firstname, String surname, int mitgliedsnummer) {
		super(firstname, surname);
		this.mitgliedsnummer = mitgliedsnummer;
	}

	public Trainer(String firstname, String surname, int mitgliedsnummer, int bla) {
		super(firstname, surname);
	}

	
	public int getMitgliedsnummer() {
		return mitgliedsnummer;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " hat die Mitgliedsnummer " + mitgliedsnummer;
	}
}

