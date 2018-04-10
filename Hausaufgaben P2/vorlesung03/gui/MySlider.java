package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class MySlider extends JFrame {
	
	private JPanel colorPanel = new JPanel();
	
	private JSlider redSlider = new JSlider(0, 255, 0);
	private JSlider greenSlider = new JSlider(0, 255, 0);
	private JSlider blueSlider = new JSlider(0, 255, 0);
	
	private JTextField redValue = new JTextField("0");
	private JTextField greenValue = new JTextField("0");
	private JTextField blueValue = new JTextField("0");
	
	private JLabel redText = new JLabel("Red");
	private JLabel greenText = new JLabel("Green");
	private JLabel blueText = new JLabel("Blue");

	
	
	public MySlider() {

		setTitle("Color Changer");
		
		JPanel buttomPanel = new JPanel();
		buttomPanel.setLayout(new BoxLayout(buttomPanel, BoxLayout.X_AXIS));
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
		textPanel.add(redText);
		textPanel.add(greenText);
		textPanel.add(blueText);
		
		JPanel sliderPanel = new JPanel();
		sliderPanel.setLayout(new BoxLayout(sliderPanel, BoxLayout.Y_AXIS));
		sliderPanel.add(redSlider);
		sliderPanel.add(greenSlider);
		sliderPanel.add(blueSlider);
		
		JPanel ValuePanel = new JPanel();
		ValuePanel.setLayout(new BoxLayout(ValuePanel, BoxLayout.Y_AXIS));
		ValuePanel.add(redValue);
		ValuePanel.add(greenValue);
		ValuePanel.add(blueValue);

		buttomPanel.add(textPanel);
		buttomPanel.add(Box.createHorizontalStrut(5));
		buttomPanel.add(sliderPanel);
		buttomPanel.add(Box.createHorizontalStrut(5));
		buttomPanel.add(ValuePanel);
		
		add(colorPanel, BorderLayout.CENTER);
		add(buttomPanel, BorderLayout.SOUTH);
		
		colorPanel.setBackground(Color.BLACK);
		
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	
	
	
	/**
	 * @return the colorPanel
	 */
	public JPanel getColorPanel() {
		return colorPanel;
	}




	/**
	 * @return the redSlider
	 */
	public JSlider getRedSlider() {
		return redSlider;
	}




	/**
	 * @return the greenSlider
	 */
	public JSlider getGreenSlider() {
		return greenSlider;
	}




	/**
	 * @return the blueSlider
	 */
	public JSlider getBlueSlider() {
		return blueSlider;
	}




	/**
	 * @return the redValue
	 */
	public JTextField getRedValue() {
		return redValue;
	}




	/**
	 * @return the greenValue
	 */
	public JTextField getGreenValue() {
		return greenValue;
	}




	/**
	 * @return the blueValue
	 */
	public JTextField getBlueValue() {
		return blueValue;
	}



	public void update (Color color, int value) {
		if (color == Color.BLUE) {
			blueSlider.setValue(value);
			blueValue.setText(String.valueOf(value));
		}
		else if (color == Color.GREEN) {
			greenSlider.setValue(value);
			greenValue.setText(String.valueOf(value));
		}
		else if (color == Color.RED) {
			redSlider.setValue(value);
			redValue.setText(String.valueOf(value));
		}
		
		colorPanel.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
	}

	public static void main(String[] args) {
		new SliderController(new MySlider());
	}
}
