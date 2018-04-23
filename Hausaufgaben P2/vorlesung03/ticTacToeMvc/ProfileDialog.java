package ticTacToeMvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProfileDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField namePlayer1 = new JTextField(12);
	private JTextField namePlayer2 = new JTextField(12);
	
	public ProfileDialog(JFrame frame, String title, boolean modal) {
		super(frame, title, modal);

		
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
		labelPanel.setBackground(Color.WHITE);
		JLabel player1Label = new JLabel("Name Spieler 1:");
		JLabel player2Label = new JLabel("Name Spieler 2:");
		labelPanel.add(player1Label);
		labelPanel.add(Box.createVerticalStrut(20));
		labelPanel.add(player2Label);

		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		player1Label.setFont(font);
		player2Label.setFont(font);
		namePlayer1.setFont(font);
		namePlayer2.setFont(font);
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new BoxLayout(namePanel, BoxLayout.Y_AXIS));
		namePanel.setBackground(Color.WHITE);
		namePanel.add(namePlayer1);		
		namePanel.add(Box.createVerticalStrut(20));
		namePanel.add(namePlayer2);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.X_AXIS));
		centerPanel.add(labelPanel);
		centerPanel.add(Box.createHorizontalStrut(20)); 
		centerPanel.add(namePanel);
		centerPanel.setBackground(Color.WHITE);
		
		add(PaddingService.createPaddings(40, true), BorderLayout.NORTH);
		add(PaddingService.createPaddings(40, true), BorderLayout.SOUTH);
		add(PaddingService.createPaddings(40, false), BorderLayout.EAST);
		add(PaddingService.createPaddings(40, false), BorderLayout.WEST);
		add(centerPanel, BorderLayout.CENTER);
		
		pack();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	
	public JTextField getNamePlayer1() {
		return namePlayer1;
	}
	
	public JTextField getNamePlayer2() {
		return namePlayer2;
	}
}
