package ticTacToeMvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Controller {
	
	public Controller(GUI gui, GameLogic gameLogic) {
		
		gui.getAbout().addActionListener(l -> {
//			new AboutDialog(gui, "About", true);
			JOptionPane.showMessageDialog(gui, "bla");
		});
		
		for (JButton btn : gui.getButtons()) {
			gui.btn0.addActionListener(l -> {
				if (gameLogic.setSymbol(0)) {
					if (gameLogic.isGameOver()) {
						gui.update(0);								
						gui.setGameOver(gameLogic.getGewinner());
					} else {
						gui.update(0);								
					}
				}

			});
			
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
