package mvcTemplate;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View extends JFrame{
	
	private JButton okBtn = new JButton("OK");
	private JTextField nameField = new JTextField(10);
	private JLabel textLbl = new JLabel("Name:");
	private Model model;
	
	public View(Model model) {
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
	
	public void update () {
		textLbl.setText("Hallo " + model.getName());
	}

}
