package windowListenerBsp;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

	private JButton btn = new JButton("Ok");
	
	public MyFrame() {

		add(new JLabel("Bitte klick den Button"), BorderLayout.NORTH);
		add(btn, BorderLayout.CENTER);
		
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public JButton getBtn() {
		return btn;
	}
}
