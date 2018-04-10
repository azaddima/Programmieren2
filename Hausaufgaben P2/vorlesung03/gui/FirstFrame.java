package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class FirstFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FirstFrame() {

		setLayout(new BorderLayout());
		JLabel label = new JLabel("ein komplettes Layout");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.NORTH);
		
		JPanel colorPanel = new JPanel();
		JRadioButton redRB = new JRadioButton("red");
		JRadioButton blueRB = new JRadioButton("blue");
		JRadioButton greenRB = new JRadioButton("green");
		colorPanel.setLayout(new GridLayout(3, 1));
		colorPanel.add(redRB);
		colorPanel.add(greenRB);
		colorPanel.add(blueRB);
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(new JLabel("bitte Text eingeben"), BorderLayout.NORTH);
		textPanel.add(new JTextArea(5, 10), BorderLayout.CENTER);
		add(colorPanel, BorderLayout.WEST);
		add(textPanel, BorderLayout.CENTER);
		JButton btn = new JButton();
		ImageIcon ic = new ImageIcon("C:\\Data\\nextCloud\\P2\\SoSe 18\\01 Vorlesung\\Images\\02 JavaDoc.PNG");
		Image i = ic.getImage();
		Image newImage = i.getScaledInstance(300, 100, Image.SCALE_SMOOTH);
		btn.setIcon(new ImageIcon(newImage));
//		btn.setMinimumSize(new Dimension(10, 20));
		add(btn, BorderLayout.SOUTH); 
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FirstFrame();
	}
}
