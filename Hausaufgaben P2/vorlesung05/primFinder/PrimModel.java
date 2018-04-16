package primFinder;

import java.util.Observable;

public class PrimModel extends Observable {

	

	public void isPrim (String number) {
		try {
			int val = Integer.valueOf(number);
			isPrim(val);
		} catch (NumberFormatException e) {

			setChanged();
			notifyObservers("Not a number");
			
		}
	}
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
