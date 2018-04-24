package paint;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class MyController {
	private Rectangle rect = new Rectangle(200, 300, 300, 300);
	
	public MyController(MyFrame view) {
		view.getPanel().setRect(rect);
		
		Timer timer = new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rect.x += 10;
				view.getPanel().repaint();
			}
		});
		
		timer.start();
	}
	
}
