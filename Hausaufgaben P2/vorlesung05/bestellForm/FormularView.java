package bestellForm;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormularView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField firstnameField = new JTextField(10);
	private JTextField lastnameField = new JTextField(10);
	private JTextField streetField = new JTextField(10);
	private JTextField housenumberField = new JTextField(10);
	private JTextField postalCodeField = new JTextField(10);
	private JTextField cityField = new JTextField(10);
	private JTextField phoneField = new JTextField(10);
	private JTextField emailField = new JTextField(10);
	private JButton send = new JButton("Send");
	
	public FormularView() {
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new FlowLayout());
		namePanel.add(new JLabel("Vorname:"));
		namePanel.add(firstnameField);
		namePanel.add(new JLabel("Nachname:"));
		namePanel.add(lastnameField);
		
		JPanel streetPanel = new JPanel();
		streetPanel.setLayout(new FlowLayout());
		streetPanel.add(new JLabel("Strasse:"));
		streetPanel.add(streetField);
		streetPanel.add(new JLabel("Hausnummer:"));
		streetPanel.add(housenumberField);
		
		JPanel cityPanel = new JPanel();
		cityPanel.setLayout(new FlowLayout());
		cityPanel.add(new JLabel("PLZ:"));
		cityPanel.add(postalCodeField);
		cityPanel.add(new JLabel("Stadt:"));
		cityPanel.add(cityField);
		
		JPanel contactPanel = new JPanel();
		contactPanel.setLayout(new FlowLayout());
		contactPanel.add(new JLabel("Telefon:"));
		contactPanel.add(phoneField);
		contactPanel.add(new JLabel("Email:"));
		contactPanel.add(emailField);
		
		add(namePanel);
		add(streetPanel);
		add(cityPanel);
		add(contactPanel);
		add(send);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	
	
	/**
	 * @return the firstnameField
	 */
	public JTextField getFirstnameField() {
		return firstnameField;
	}



	/**
	 * @return the lastnameField
	 */
	public JTextField getLastnameField() {
		return lastnameField;
	}



	/**
	 * @return the streetField
	 */
	public JTextField getStreetField() {
		return streetField;
	}



	/**
	 * @return the housenumberField
	 */
	public JTextField getHousenumberField() {
		return housenumberField;
	}



	/**
	 * @return the postalCodeField
	 */
	public JTextField getPostalCodeField() {
		return postalCodeField;
	}



	/**
	 * @return the cityField
	 */
	public JTextField getCityField() {
		return cityField;
	}



	/**
	 * @return the phoneField
	 */
	public JTextField getPhoneField() {
		return phoneField;
	}



	/**
	 * @return the emailField
	 */
	public JTextField getEmailField() {
		return emailField;
	}



	/**
	 * @return the send
	 */
	public JButton getSend() {
		return send;
	}



	public void update() {
		firstnameField.setEditable(false);
		lastnameField.setEditable(false);
		streetField.setEditable(false);
		housenumberField.setEditable(false);
		cityField.setEditable(false);
		postalCodeField.setEditable(false);
		emailField.setEditable(false);
		phoneField.setEditable(false);
		send.setEnabled(false);
	}
}
