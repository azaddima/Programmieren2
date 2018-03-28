package complexGui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ComplexLayout extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ComplexLayout() {
		
		JPanel westPanel = new JPanel();
		westPanel.setLayout(new GridLayout(3, 1));
		JRadioButton redBtn = new JRadioButton("red");
		JRadioButton greenBtn = new JRadioButton("green");
		JRadioButton blueBtn = new JRadioButton("blue");
		westPanel.add(redBtn);
		westPanel.add(greenBtn);
		westPanel.add(blueBtn);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		JLabel eingabe = new JLabel("Bitte Text eingeben");
		JTextArea textArea = new JTextArea();
		centerPanel.add(eingabe, BorderLayout.NORTH);
		centerPanel.add(textArea, BorderLayout.CENTER);
		
		JLabel text = new JLabel("ein komplexes Layout");
		text.setHorizontalAlignment(JLabel.CENTER);
		add(text, BorderLayout.NORTH);
		add(westPanel, BorderLayout.WEST);
		add(centerPanel, BorderLayout.CENTER);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComplexLayout();
	}
}
