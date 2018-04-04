package interfaces;

public abstract class Fahrzeug {
	


	private int anzahlReifen;
	private String marke;
	private int anzahlPlaetze;
	private int geschwindigkeit;
	private String farbe;
	private String model;
	private int x;
	private int y;
	
	
	public Fahrzeug() {

	}
	
	public abstract void bewegen();

	public abstract void bremsen();
	
	public abstract void beschleunigen();

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return the anzahlReifen
	 */
	public int getAnzahlReifen() {
		return anzahlReifen;
	}

	/**
	 * @param anzahlReifen the anzahlReifen to set
	 */
	public void setAnzahlReifen(int anzahlReifen) {
		this.anzahlReifen = anzahlReifen;
	}

	/**
	 * @return the marke
	 */
	public String getMarke() {
		return marke;
	}

	/**
	 * @param marke the marke to set
	 */
	public void setMarke(String marke) {
		this.marke = marke;
	}

	/**
	 * @return the anzahlPlaetze
	 */
	public int getAnzahlPlaetze() {
		return anzahlPlaetze;
	}

	/**
	 * @param anzahlPlaetze the anzahlPlaetze to set
	 */
	public void setAnzahlPlaetze(int anzahlPlaetze) {
		this.anzahlPlaetze = anzahlPlaetze;
	}

	/**
	 * @return the geschwindigkeit
	 */
	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	/**
	 * @param geschwindigkeit the geschwindigkeit to set
	 */
	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	/**
	 * @return the farbe
	 */
	public String getFarbe() {
		return farbe;
	}

	/**
	 * @param farbe the farbe to set
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
}
