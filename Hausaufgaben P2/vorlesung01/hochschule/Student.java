package hochschule;

public class Student extends Person {

	private String matrikelnr;
	private String kennung;
	
	public Student(String firstname, String surname, String matrikelnr, String kennung) {
		super (firstname, surname);
		
		this.kennung = kennung;
		this.matrikelnr = matrikelnr;
		
	}
	
	public String getKennung() {
		return kennung;
	}
	
	public String getMatrikelnr() {
		return matrikelnr;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (" + matrikelnr + ") hat die Kennung " + kennung + ".";
	}
	
}
