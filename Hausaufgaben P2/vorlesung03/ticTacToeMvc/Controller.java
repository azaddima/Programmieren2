package ticTacToeMvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
