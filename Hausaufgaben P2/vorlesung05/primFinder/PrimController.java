package primFinder;

public class PrimController {
	
	public PrimController(PrimView view, PrimModel model) {

		view.getCheckBtn().addActionListener(l -> {
			model.isPrim(view.getNumberField().getText());
		});
		
		model.addObserver(view);
	}
	
	public static void main(String[] args) {
		new PrimController(new PrimView(), new PrimModel());
	}

}
