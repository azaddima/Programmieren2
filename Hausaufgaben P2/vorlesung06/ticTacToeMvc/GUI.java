package ticTacToeMvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int CHANGE_PLAYER_NAME = 202;
//	private Color defaultColor = new Color(238, 238, 238);
	private Color defaultColor = new Color(204, 240, 99);
//	private Color defaultColor = Color.BLACK;
	
	//which turn is it - text
	private String turnText = " ist an der Reihe";
	private JLabel playerTxt = new JLabel("");
	
	//ImageIcons for x and o
	private ImageIcon player1Img = new ImageIcon("vorlesung06//ticTacToeMvc//o.jpg");
	private ImageIcon player2Img = new ImageIcon("vorlesung06//ticTacToeMvc//x.jpg");

	private ArrayList<JButton> buttons = new ArrayList<>();
	private GameLogic gameLogic;

	//menus
	private JMenuItem close = new JMenuItem("Close");
	private JMenuItem restart = new JMenuItem("Restart");
	private JMenuItem about = new JMenuItem("About");
	private JMenuItem profile = new JMenuItem("Personalize");

	
	public GUI(GameLogic gameLogic) {
		this.gameLogic = gameLogic;
		playerTxt.setText(gameLogic.getNamePlayer1() + turnText);
		
		//add menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu file = new JMenu("File");
		menuBar.add(file);
		file.add(restart);
		file.add(close);
		file.add(about);
		file.add(profile);
		
		//set Font to the menu
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		file.setFont(font);
		restart.setFont(font); 
		close.setFont(font);
		about.setFont(font);
		profile.setFont(font);
		
		//set short cuts
		restart.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
		close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		about.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
		profile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));

		//add grid with buttons
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(gameLogic.getSize(), gameLogic.getSize()));
		
		for (int i = 0; i < gameLogic.getSize()*gameLogic.getSize(); i++) {
			JButton button = new JButton("");
			//the Button get an index as action command
			button.setActionCommand(String.valueOf(i));
			buttons.add(button);
			grid.add(button);
		}
		add(grid, BorderLayout.CENTER);
		
		//the label shows which turn it is
		Box box = new Box(BoxLayout.Y_AXIS);
		box.setAlignmentX(CENTER_ALIGNMENT);
		box.setBackground(defaultColor);
		box.setOpaque(true);
		playerTxt.setOpaque(true);
		playerTxt.setBackground(defaultColor);
		playerTxt.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		playerTxt.setFont(font.deriveFont(Font.BOLD, new Float(26)));
		box.add(PaddingService.createPaddings(20, true, defaultColor));
		box.add(playerTxt);
		box.add(PaddingService.createPaddings(20, true, defaultColor));
		add(box, BorderLayout.NORTH);	
		add(PaddingService.createPaddings(20, true, defaultColor), BorderLayout.SOUTH);
		add(PaddingService.createPaddings(20, false, defaultColor), BorderLayout.EAST);
		add(PaddingService.createPaddings(20, false, defaultColor), BorderLayout.WEST);

		
		setVisible(true);
		setSize(550, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/**
	 * 
	 * @return about menu item
	 */
	public JMenuItem getAbout() {
		return about;
	}
	
	/**
	 * 
	 * @return close menu item
	 */
	public JMenuItem getClose() {
		return close;
	}
	
	/**
	 * 
	 * @return restart menu item
	 */
	public JMenuItem getRestart() {
		return restart;
	}
	
	/**
	 * 
	 * @return profile menu item
	 */
	public JMenuItem getProfile() {
		return profile;
	}

	
	/**
	 * 
	 * @return arraylist with JButtons
	 */
	public ArrayList<JButton> getButtons() {
		return buttons;
	}

	/**
	 * The method display the end of the game and disables all buttons.
	 * @param player 1 or 2 for player 1 or player 2. 0 for no one won.
	 */
	public void setGameOver(int player) {
		if (player == GameLogic.UNENDSCHIEDEN) {
			playerTxt.setText("Unendschieden");
			playerTxt.setBackground(Color.GREEN.darker());
		} 
		else {
			if (player == GameLogic.SPIELER_1) {
				playerTxt.setText(gameLogic.getNamePlayer1() + " hat gewonnen!");				
			} else {
				playerTxt.setText(gameLogic.getNamePlayer2() + " hat gewonnen!");								
			}
			playerTxt.setForeground(Color.WHITE);
			playerTxt.setBackground(Color.RED.darker());
			
		}
		for (JButton btn : buttons) {
			btn.setEnabled(false);
		}

	}
	
	
	/**
	 * Updates the view. The button with the index get the current player icon. 
	 * The text for the current player is updated.
	 * @param index the index of the button where the images should be set
	 */
	public void update(int index) {
		
		if (index < buttons.size() && index >= 0) {
			if (gameLogic.aktuellerSpieler() == GameLogic.SPIELER_1) {
	//			buttons.get(index).setText("X");			
				buttons.get(index).setIcon(player1Img);
				playerTxt.setText(gameLogic.getNamePlayer1() + turnText);
			} else {
	//			buttons.get(index).setText("O");
				buttons.get(index).setIcon(player2Img);
				playerTxt.setText(gameLogic.getNamePlayer2() + turnText);
			}
		} else if(index == CHANGE_PLAYER_NAME) {
			if (gameLogic.aktuellerSpieler() == GameLogic.SPIELER_1) {
				playerTxt.setText(gameLogic.getNamePlayer1() + turnText);
			} else {
				playerTxt.setText(turnText);
			}
		}
	}
}
