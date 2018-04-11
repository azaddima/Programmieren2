package mvcTemplate;

public class Controller {
	
	public Controller(View view, Model model) {
		view.getOkBtn().addActionListener(l -> {
			model.setName(view.getNameField().getText());
			view.update();
		});
		
	}
	
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View(model);
		new Controller(view, model);
	}

}
