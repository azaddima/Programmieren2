package hochschule;

public class Professor extends Person {

	private String mitarbeiterNr;
	private String kuerzel;
	
	public Professor(String firstname, String surname, String mitarbeiterNr, String kuerzel) {
		super (firstname, surname);
		
		this.kuerzel = kuerzel;
		this.mitarbeiterNr = mitarbeiterNr;
	}
	
	public String getKuerzel() {
		return kuerzel;
	}
	
	public String getMitarbeiterNr() {
		return mitarbeiterNr;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (" + mitarbeiterNr + ") hat das Kuerzel " + kuerzel + ".";
	}
}
