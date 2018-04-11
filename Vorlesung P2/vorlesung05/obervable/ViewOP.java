package obervable;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewOP extends JFrame implements Observer{
	
	private JButton okBtn = new JButton("OK");
	private JTextField nameField = new JTextField(10);
	private JLabel textLbl = new JLabel("Name:");
	private ModelOP model;
	
	public ViewOP(ModelOP model) {
		this.model = model;
		setLayout(new FlowLayout());
		
		add(textLbl);
		add(nameField);
		add(okBtn);
		
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public JButton getOkBtn() {
		return okBtn;
	}
	
	public JTextField getNameField() {
		return nameField;
	}
	

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof String) {
			String name = (String) arg;
			textLbl.setText("Hallo " + name);
		}
	}

}
