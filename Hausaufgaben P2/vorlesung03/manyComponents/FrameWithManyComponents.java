package manyComponents;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FrameWithManyComponents extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String TEXT = "enter text here";
	private JButton okBtn = new JButton("Ok");
	private JButton cancelBtn = new JButton("Cancel");
	private JRadioButton plainRBtn = new JRadioButton("plain");
	private JRadioButton boldRBtn = new JRadioButton("bold");
	private JRadioButton italicRBtn = new JRadioButton("italic");
	private JTextField textField = new JTextField(TEXT);
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
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(plainRBtn);
		buttonGroup.add(boldRBtn);
		buttonGroup.add(italicRBtn);
		plainRBtn.setSelected(true);
		
		JPanel thirdPanel = new JPanel();
		thirdPanel.setLayout(new FlowLayout());
		thirdPanel.add(okBtn);
		thirdPanel.add(cancelBtn);
		
		add(firstPanel);
		add(secondPanel);
		add(thirdPanel);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(80, 200);
		setVisible(true);
		
		italicRBtn.setFocusable(true);
		italicRBtn.grabFocus();
		italicRBtn.requestFocusInWindow();
				
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
		new ManyComponentsController(new FrameWithManyComponents());
	}
	
}
