package ticTacToeObserver;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//wer ist an der Reihe - Text
	private static final String SPIELER1_TEXT = "Spieler 1 ist an der Reihe";
	private static final String SPIELER2_TEXT = "Spieler 2 ist an der Reihe";
	private JLabel playerTxt = new JLabel(SPIELER1_TEXT);
	
	//ImageIcons fuer x und o
	private ImageIcon player1Img = new ImageIcon("vorlesung03//ticTacToeMvc//o.jpg");
	private ImageIcon player2Img = new ImageIcon("vorlesung03//ticTacToeMvc//x.jpg");

	private ArrayList<JButton> buttons = new ArrayList<>();
	private GameLogic gameLogic;
	
	public GUI(GameLogic gameLogic) {
		this.gameLogic = gameLogic;

		//das Grid mit den Button wird aufgebaut
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(gameLogic.getSize(), gameLogic.getSize()));
		for (int i = 0; i < gameLogic.getSize()*gameLogic.getSize(); i++) {
			JButton button = new JButton("");
			//die Button bekommen den Index als action command
			button.setActionCommand(String.valueOf(i));
			buttons.add(button);
			grid.add(button);
		}
		add(grid, BorderLayout.CENTER);
		
		//das Label, das anzeigt welcher Spieler dran ist, wird vorbereitet
		playerTxt.setHorizontalAlignment(JLabel.CENTER);
		Font font = playerTxt.getFont();
		playerTxt.setFont(font.deriveFont(new Float(26)));
		add(playerTxt, BorderLayout.NORTH);	
		
		setVisible(true);
		setSize(550, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public ArrayList<JButton> getButtons() {
		return buttons;
	}

	
	public void setGameOver(int player) {
		playerTxt.setText("Der Spieler " + player + " hat gewonnen!");
		
		for (JButton btn : buttons) {
			btn.setEnabled(false);
		}
	}
	

	@Override
	public void update(Observable o, Object arg) {

		if (arg instanceof Integer)
		{
			int index = (Integer) arg;
			System.out.println(index);
			if (gameLogic.aktuellerSpieler() == GameLogic.SPIELER_1) {
//				buttons.get(index).setText("X");
				buttons.get(index).setIcon(player1Img);
				playerTxt.setText(SPIELER1_TEXT);
			} else {
//				buttons.get(index).setText("O");
				buttons.get(index).setIcon(player2Img);
				playerTxt.setText(SPIELER2_TEXT);
			}
			
		}
		else if (arg instanceof Boolean) {
			boolean player1 = (Boolean) arg;

			playerTxt.setText("Der Spieler " + (player1? 1 : 2) + " hat gewonnen!");
			
			for (JButton btn : buttons) {
				btn.setEnabled(false);
			}
		} 
		else if (arg == null) {
			playerTxt.setText("Unendschieden!");
			
			for (JButton btn : buttons) {
				btn.setEnabled(false);
			}
			
		}

		
	}
}
