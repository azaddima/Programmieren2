package manyComponents;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FrameWithManyComponents extends JFrame {

	private JButton okBtn = new JButton("Ok");

	private JButton cancelBtn = new JButton("Cancel");
	private JRadioButton plainRBtn = new JRadioButton("plain");
	private JRadioButton boldRBtn = new JRadioButton("bold");
	private JRadioButton italicRBtn = new JRadioButton("italic");
	private JTextField textField = new JTextField("enter text here");
	private JCheckBox checkBox = new JCheckBox("Ich stimme zu");
	
	public FrameWithManyComponents() {

		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		JPanel firstPanel = new JPanel();
		firstPanel.setLayout(new FlowLayout());
		firstPanel.add(textField);
		firstPanel.add(checkBox);

		JPanel secondPanel = new JPanel();
		secondPanel.setLayout(new FlowLayout());
		secondPanel.add(plainRBtn);
		secondPanel.add(boldRBtn);
		secondPanel.add(italicRBtn);
		
		JPanel thirdPanel = new JPanel();
		thirdPanel.setLayout(new FlowLayout());
		thirdPanel.add(okBtn);
		thirdPanel.add(cancelBtn);
		
		add(firstPanel);
		add(secondPanel);
		add(thirdPanel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(80, 200);
		setVisible(true);
	}

	/**
	 * @return the okBtn
	 */
	public JButton getOkBtn() {
		return okBtn;
	}

	/**
	 * @return the cancelBtn
	 */
	public JButton getCancelBtn() {
		return cancelBtn;
	}

	/**
	 * @return the plainRBtn
	 */
	public JRadioButton getPlainRBtn() {
		return plainRBtn;
	}

	/**
	 * @return the boldRBtn
	 */
	public JRadioButton getBoldRBtn() {
		return boldRBtn;
	}

	/**
	 * @return the italicRBtn
	 */
	public JRadioButton getItalicRBtn() {
		return italicRBtn;
	}

	/**
	 * @return the textField
	 */
	public JTextField getTextField() {
		return textField;
	}

	/**
	 * @return the checkBox
	 */
	public JCheckBox getCheckBox() {
		return checkBox;
	}


	public static void main(String[] args) {
		new Controller(new FrameWithManyComponents());
	}
	
}
