package bestellForm;

import javax.swing.JOptionPane;

public class FormController {

	
	public FormController(FormularView view, Userdaten model) {
		view.getSend().addActionListener(l -> {
			model.setFirstname(view.getFirstnameField().getText());
			model.setLastname(view.getLastnameField().getText());

			model.setStreet(view.getStreetField().getText());
			model.setHouseNumber(view.getHousenumberField().getText());

			model.setPostalCode(view.getPostalCodeField().getText());
			model.setCity(view.getCityField().getText());
			model.setEmail(view.getEmailField().getText());
			model.setPhoneNumber(view.getPhoneField().getText());
			
			view.update();
			JOptionPane.showMessageDialog(view, "Ihre Daten wurden gesendet");
		});
	}
	
	public static void main(String[] args) {
		Userdaten userdaten = new Userdaten();
		new FormController(new FormularView(), userdaten);
	}

}
