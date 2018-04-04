package manyComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	
	public Controller(FrameWithManyComponents view) {
		view.getOkBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getOkBtn().setText("wurde gespeichert");
			}
		});
	
		view.getCancelBtn().addActionListener(l -> view.getCancelBtn().setText("Huhu"));
	}

}
