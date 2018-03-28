package firstGui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	public MyFrame() {
//		setLayout(new FlowLayout());

		setLayout(new BorderLayout());
		add(new JLabel("Name:"), BorderLayout.NORTH);
		add(new JTextField("bitte gib deinen Namen ein", 30), BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setSize(300, 400);
		pack();
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
