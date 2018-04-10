package gui;

import java.awt.Color;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderController {
	
	public SliderController(MySlider mySlider) {

		mySlider.getBlueSlider().addChangeListener(l -> {
			mySlider.update(Color.BLUE, mySlider.getBlueSlider().getValue());
		});

		mySlider.getGreenSlider().addChangeListener(l -> {
			mySlider.update(Color.GREEN, mySlider.getGreenSlider().getValue());
		});

		mySlider.getRedSlider().addChangeListener(l -> {
			mySlider.update(Color.RED, mySlider.getRedSlider().getValue());
		});
		
		mySlider.getBlueValue().addActionListener(l -> {
			try {
				int val = Integer.valueOf(mySlider.getBlueValue().getText());
				if (val >= 0 && val <= 255) {
					mySlider.update(Color.BLUE, val);					
				}
				else 
				{
					mySlider.update(Color.BLUE, mySlider.getBlueSlider().getValue());													
				}
			} catch (NumberFormatException e) {
				mySlider.update(Color.BLUE, mySlider.getBlueSlider().getValue());													
			}
		});
		
		mySlider.getGreenValue().addActionListener(l -> {
			try {
				int val = Integer.valueOf(mySlider.getGreenValue().getText());
				if (val >= 0 && val <= 255) {
					mySlider.update(Color.GREEN, val);					
				}
				else 
				{
					mySlider.update(Color.GREEN, mySlider.getGreenSlider().getValue());													
				}
			} catch (NumberFormatException e) {
				mySlider.update(Color.GREEN, mySlider.getGreenSlider().getValue());													
			}
		});

		mySlider.getRedValue().addActionListener(l -> {
			try {
				int val = Integer.valueOf(mySlider.getRedValue().getText());
				if (val >= 0 && val <= 255) {
					mySlider.update(Color.RED, val);					
				}
				else 
				{
					mySlider.update(Color.RED, mySlider.getRedSlider().getValue());													
				}
			} catch (NumberFormatException e) {
				mySlider.update(Color.RED, mySlider.getRedSlider().getValue());													
			}
		});

	}

}
