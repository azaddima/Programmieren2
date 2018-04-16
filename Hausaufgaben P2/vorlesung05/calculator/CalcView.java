package calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalcView extends JFrame implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private JButton btn0 = new JButton("0");
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	private JButton btnMinus = new JButton("-");
	private JButton btnPlus = new JButton("+");
	private JButton btnProd = new JButton("*");
	private JButton btnDiv = new JButton("/");
	private JButton btnEquals = new JButton("=");
	private JButton btnPoint = new JButton(".");
	
	private JLabel input = new JLabel(" ");
	
	public CalcView() {

		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(4, 4));
		gridPanel.add(btn7);
		gridPanel.add(btn8);
		gridPanel.add(btn9);
		gridPanel.add(btnDiv);
		gridPanel.add(btn4);
		gridPanel.add(btn5);
		gridPanel.add(btn6);
		gridPanel.add(btnProd);
		gridPanel.add(btn1);
		gridPanel.add(btn2);
		gridPanel.add(btn3);
		gridPanel.add(btnMinus);
		gridPanel.add(btn0);
		gridPanel.add(btnPoint);
		gridPanel.add(btnEquals);
		gridPanel.add(btnPlus);
		
		add(input, BorderLayout.NORTH);
		add(gridPanel, BorderLayout.CENTER);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	/**
	 * @return the btn0
	 */
	public JButton getBtn0() {
		return btn0;
	}



	/**
	 * @return the btn1
	 */
	public JButton getBtn1() {
		return btn1;
	}



	/**
	 * @return the btn2
	 */
	public JButton getBtn2() {
		return btn2;
	}



	/**
	 * @return the btn3
	 */
	public JButton getBtn3() {
		return btn3;
	}



	/**
	 * @return the btn4
	 */
	public JButton getBtn4() {
		return btn4;
	}



	/**
	 * @return the btn5
	 */
	public JButton getBtn5() {
		return btn5;
	}



	/**
	 * @return the btn6
	 */
	public JButton getBtn6() {
		return btn6;
	}



	/**
	 * @return the btn7
	 */
	public JButton getBtn7() {
		return btn7;
	}



	/**
	 * @return the btn8
	 */
	public JButton getBtn8() {
		return btn8;
	}



	/**
	 * @return the btn9
	 */
	public JButton getBtn9() {
		return btn9;
	}



	/**
	 * @return the btnMinus
	 */
	public JButton getBtnMinus() {
		return btnMinus;
	}



	/**
	 * @return the btnPlus
	 */
	public JButton getBtnPlus() {
		return btnPlus;
	}



	/**
	 * @return the btnProd
	 */
	public JButton getBtnProd() {
		return btnProd;
	}



	/**
	 * @return the btnDiv
	 */
	public JButton getBtnDiv() {
		return btnDiv;
	}



	/**
	 * @return the btnEquals
	 */
	public JButton getBtnEquals() {
		return btnEquals;
	}



	/**
	 * @return the btnPoint
	 */
	public JButton getBtnPoint() {
		return btnPoint;
	}



	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof String) {
			input.setText((String) arg);			
		}
	
	}

}
