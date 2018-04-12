package focus;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * This class implements a gui with a title and 12 buttons. A component changes its color by calling the update() method. 
 * This example shows how the focus listener works and how you can set the focus.
 * 
 * @author Stephanie Boehning
 * @version 1.0
 *
 */
public class FocusView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel welcomeLabel = new JLabel("Hello, welcome to the Focus World!");
	private Color defaultColorLabel = new Color(200, 100, 100);
	private Color defaultColorBtn = new Color(100, 100, 100);
	
	private ArrayList<JButton> buttons = new ArrayList<>();
	
	public FocusView() {

		add(welcomeLabel, BorderLayout.NORTH);
		welcomeLabel.setFont(new Font(welcomeLabel.getFont().getFontName(), Font.PLAIN, 16));
		welcomeLabel.setOpaque(true);
		welcomeLabel.setBackground(defaultColorLabel);
		welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
		welcomeLabel.setFocusable(true);
		
		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(4, 3));
		
		for (int i = 0; i < 12; i++) {
			JButton btn = new JButton("");
			btn.setActionCommand(String.valueOf(i));
			btn.setBackground(defaultColorBtn);
			btn.setFocusable(true);
			buttons.add(btn);
			gridPanel.add(btn);
			
		}
		
		add(gridPanel);
		
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
		buttons.get(0).requestFocus();
		buttons.get(0).requestFocusInWindow();
	}
	
	
	
	/**
	 * @return the welcomeLabel
	 */
	public JLabel getWelcomeLabel() {
		return welcomeLabel;
	}



	/**
	 * @return the buttons
	 */
	public ArrayList<JButton> getButtons() {
		return buttons;
	}



	/**
	 * This method updates the color of the components. 
	 * @param index of the component. Use 0-11 for the buttons and -102 for the label
	 * 
	 */
	public void update (int index) {

		for (JButton btn : buttons) {
			btn.setBackground(defaultColorBtn);
		}
		welcomeLabel.setBackground(defaultColorLabel);
		
		if (index == FocusController.TEXT_ID) {
			welcomeLabel.setBackground(Color.YELLOW);
		}
		else if (index >= 0 && index < buttons.size()) {
			buttons.get(index).setBackground(Color.GREEN);
		} 


	}
}
