package ticTacToeMvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;

public class Controller {

	private GUI gui;
	private GameLogic gameLogic;
	
	public Controller(GUI gui, GameLogic gameLogic) {
		this.gui = gui;
		this.gameLogic = gameLogic;
		
		restart();
	}
	
	private void restart () {
		gui.getAbout().addActionListener(l -> {
			new AboutDialog(gui, "About", true);
//			JOptionPane.showMessageDialog(gui, "bla");
		});
		
		
		
		gui.getProfile().addActionListener(l -> {
			ProfileDialog dialog = new ProfileDialog(gui, "Personalize", true);
			dialog.addWindowListener(new WindowAdapter() {
								
				@Override
				public void windowClosing(WindowEvent arg0) {
				}
				
				@Override
				public void windowClosed(WindowEvent arg0) {
					String namePlayer1 = dialog.getNamePlayer1().getText();
					String namePlayer2 = dialog.getNamePlayer2().getText();
					gameLogic.setNamePlayer1(namePlayer1);
					gameLogic.setNamePlayer2(namePlayer2);
					gui.update(GUI.CHANGE_PLAYER_NAME);
				}
			});
		});
		
		gui.getClose().addActionListener(l -> {
			gui.dispose();
		});

		gui.getRestart().addActionListener(l -> {
			gameLogic.reset();
			gui.dispose();
			gui = new GUI(gameLogic);
			restart();
		});
		
		for (JButton btn : gui.getButtons()) {
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String str = e.getActionCommand();	//hole den Index von dem Button
					try {
						int index = Integer.valueOf(str);						
						if (gameLogic.setSymbol(index)) {
							if (gameLogic.isGameOver()) {
								gui.update(index);								
								gui.setGameOver(gameLogic.getGewinner());
							} else {
								gui.update(index);								
							}
						}
					} catch (NumberFormatException ex) {
						ex.printStackTrace();
					}
				}
			});
		}		
		
	}
}
