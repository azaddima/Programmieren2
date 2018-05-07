package windowListenerBsp;

import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyDialog extends JDialog {
	
	private JTextField nameTextField = new JTextField(10);
	
	public MyDialog() {

		setLayout(new FlowLayout());
		add(new JLabel("Name:"));
		add(nameTextField);
		
		//wichtig: DISPOSE um sich die Daten mit dem WindowListener abzuholen
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	
	public JTextField getNameTextField() {
		return nameTextField;
	}

}
