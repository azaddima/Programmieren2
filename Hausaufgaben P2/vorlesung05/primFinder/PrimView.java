package primFinder;

import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimView extends JFrame implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField numberField = new JTextField(5);
	private JButton checkBtn = new JButton("Check Primzahl");
	private JLabel resultLabel = new JLabel("");
	
	public PrimView() {

		setLayout(new FlowLayout());
		resultLabel.setVisible(false);
		
		add(new JLabel("Bitte geben Sie hier eine Primzahl ein:"));
		add(numberField);
		add(resultLabel);
		add(checkBtn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 200);
		setVisible(true);
	}
	
	public JButton getCheckBtn() {
		return checkBtn;
	}
	
	public JTextField getNumberField() {
		return numberField;
	}
	
	@Override
	public void update(Observable o, Object arg) {

		if (arg instanceof Boolean) {
			boolean isPrim = (boolean) arg;
			
			if (isPrim)
				resultLabel.setText("Die Zahl ist eine Primzahl");
			else
				resultLabel.setText("Die Zahl ist keine Primzahl");
		}
		else if (arg instanceof String) {
			resultLabel.setText((String) arg);
		}
		resultLabel.setVisible(true);
	}

}
