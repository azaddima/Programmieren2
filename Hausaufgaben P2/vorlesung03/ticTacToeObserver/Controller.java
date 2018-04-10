package ticTacToeObserver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller {
	
	public Controller(GUI gui, GameLogic gameLogic) {
		gameLogic.addObserver(gui);
		for (JButton btn : gui.getButtons()) {
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String str = e.getActionCommand();
					try {
						int index = Integer.valueOf(str);						
						if (gameLogic.setSymbol(index)) {
//							if (gameLogic.isGameOver()) {
//								gui.update(index);								
//								gui.setGameOver(gameLogic.getGewinner());
//							} else {
//								gui.update(index);								
//							}
						}
					} catch (NumberFormatException ex) {
						ex.printStackTrace();
					}
				}
			});
		}		
	}

}
