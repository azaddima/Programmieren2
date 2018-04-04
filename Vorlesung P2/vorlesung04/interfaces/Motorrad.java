package interfaces;

public class Motorrad extends Fahrzeug implements Kaufbar{

	private int anzahlGaenge;
	private String lizenz;
	private double preis;
	
	
	public Motorrad() {
		setAnzahlPlaetze(2);
		setAnzahlReifen(2);
		preis = 8000.00;
	}
	
	@Override
	public void bewegen() {
		setX(getX() + getGeschwindigkeit());
		setY(getY() + getGeschwindigkeit());
		
	}

	@Override
	public void bremsen() {
		setGeschwindigkeit(getGeschwindigkeit() - 1);		
	}

	@Override
	public void beschleunigen() {
		setGeschwindigkeit(getGeschwindigkeit() + 1);
		
	}

	@Override
	public double preis() {

		return preis;
	}
	
	//test zum zeigen wie wir mit Listenern umgehen können
	@Override
	public void besitzer() {
		// TODO Auto-generated method stub
		
	}

}
