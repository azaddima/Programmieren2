package primFinder;

public class PrimController {
	
	public PrimController(PrimView view, PrimModel model) {

		//wir holen uns von der View den Text im Textfeld und übergeben den Wert unserem Model.
		//Dieser prüft, ob die übergebene Zahl eine Primzahl ist.
		view.getCheckBtn().addActionListener(l -> {
			model.isPrim(view.getNumberField().getText());
		});
		
		//Hier werden View und model verknüpft, ab jetzt bekommt die View alle 
		//Benachrichtigungen (notifyObservers) von dem Model
		model.addObserver(view);
	}
	
	public static void main(String[] args) {
		new PrimController(new PrimView(), new PrimModel());
	}

}
