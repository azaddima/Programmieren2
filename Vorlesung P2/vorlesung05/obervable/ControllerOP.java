package obervable;

public class ControllerOP {
	
	public ControllerOP(ViewOP view, ModelOP model) {
		view.getOkBtn().addActionListener(l -> {
			model.setName(view.getNameField().getText());
		});
		model.addObserver(view);
	}
	
	public static void main(String[] args) {
		ModelOP model = new ModelOP();
		ViewOP view = new ViewOP(model);
		new ControllerOP(view, model);
	}

}
