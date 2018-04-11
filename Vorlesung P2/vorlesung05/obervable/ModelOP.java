package obervable;

import java.util.Observable;

public class ModelOP extends Observable{

	private String name;
	
	public void setName(String text) {
		name = text;
		setChanged();
		notifyObservers(name);
	}

	public String getName() {
		return name;
	}

}
