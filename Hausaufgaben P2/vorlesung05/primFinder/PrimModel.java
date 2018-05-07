package primFinder;

import java.util.Observable;

/* Unsere Klasse PrimModel soll von Observable erben (es soll observierbar sein), 
 * damit bei jeder Änderung des Model ein Event rausgeschickt wird, dass der View mitteilt,
 * dass sich Daten im Model geändert haben.
 */
public class PrimModel extends Observable {


	/**
	 * Die Methode isPrim() prüft, ob die übergebene Zahl eine Primzahl ist. 
	 * Allen Observern (unserer View) wird ein boolean Wert in der Update-Methode übergeben. 
	 * True, wenn die Zahl eine Primzahl ist, false andernfalls.
	 * Wenn number keine Zahl ist, wird der String "Not a number" in der Update-Methode der View übergeben.
	 * 
	 * @param number Zahl bei der geprüft wird, ob es eine Primzahl ist.
	 */
	public void isPrim (String number) {
		
		/* Integer.valueOf kann eine NumberFormatException werfen, 
		 * wenn in dem String number gar keine Zahl ist,
		 * deswegen müssen wir die Exception mit try catch abfangen.
		 * Im try Block versuchen wir all das zu machen, was eine Exception werfen kann.
		 * Da wir die isPrim()-Methode mit der Zahl nur dann aufrufen wollen, 
		 * wenn in number auch eine Zahl steht, müssen wir den Aufruf auch im try-Block machen.
		 */
		try {
			int val = Integer.valueOf(number);
			isPrim(val);
		} catch (NumberFormatException e) {

			//Wenn in number keine Zahl steht, bekommt die View in der Update Methode einen String mit "not a number"
			setChanged();
			notifyObservers("Not a number");
			
		}
	}
	
	/**
	 * Die Methode isPrim() prüft, ob die übergebene Zahl eine Primzahl ist. 
	 * Allen Observern (unserer View) wird ein boolean Wert in der Update-Methode übergeben. 
	 * True, wenn die Zahl eine Primzahl ist, false andernfalls
	 * 
	 * @param number Zahl bei der geprüft wird, ob es eine Primzahl ist.
	 */
	public void isPrim (int number) {
		boolean isPrim = true;

		if (number < 2)
			isPrim = false;
		else if (number % 2 == 0)
			isPrim = false;
		
		for (int i = 3; i < number/2; i+=2) {
			if(number % i == 0) {
				isPrim = false;
			}
		}
				
		setChanged();
		notifyObservers(isPrim);
	}
	
}
