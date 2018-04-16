package calculator;

import java.util.Observable;

public class CalcModel extends Observable{
	
	private String input = "";
	private String number = "";
	private double num1 = 0.0;
	private double num2 = 0.0;
	private char operation = ' ';
	
	public void addChar (char c) {
		input += c;
		number += c;
		setChanged();
		notifyObservers(input);
	}

	public void calculate() {
		if (operation == ' ') {
			setChanged();
			notifyObservers(input);
		} 
		else {
			try {
				num2 = Double.parseDouble(number);
				switch (operation) {
				case '+':
					num1 += num2;
					break;
				case '-':
					num1 -= num2;
					break;
				case '*':
					num1 *= num2;
					break;
				case '/':
					num1 /= num2;
					break;

				default:
					break;
				}
			
				setChanged();
				notifyObservers(String.valueOf(num1));
				num1 = 0.0;
				num2 = 0.0;
				operation = ' ';
				input = "";
				number = "";
			} catch (Exception e) {
				setChanged();
				notifyObservers("NAN");				
			}
		}

		
	}

	public void addition() {
		num1 = Double.parseDouble(number);
		number = "";
		operation = '+';
		input += " " + operation + " ";
		setChanged();
		notifyObservers(input);
	}

	public void minus() {
		num1 = Double.parseDouble(number);
		number = "";
		operation = '-';
		input += " " + operation + " ";
		setChanged();
		notifyObservers(input);
		
	}

	public void prod() {
		num1 = Double.parseDouble(number);
		number = "";
		operation = '*';
		input += " " + operation + " ";
		setChanged();
		notifyObservers(input);

	}

	public void div() {
		num1 = Double.parseDouble(number);
		number = "";
		operation = '/';
		input += " " + operation + " ";
		setChanged();
		notifyObservers(input);

	}

}
