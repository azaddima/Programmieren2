package focus;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;

public class FocusController {

	public static final int TEXT_ID = -102;
	
	private FocusView view;
	
	public FocusController(FocusView view) {
		this.view = view;
		
		for (JButton btn : view.getButtons()) {
			
			//add focusListener to the Buttons
			btn.addFocusListener(new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent e) {
					modifyView(((JButton) e.getComponent()).getActionCommand());
				}
				
				@Override
				public void focusGained(FocusEvent e) {
					modifyView(((JButton) e.getComponent()).getActionCommand());
				}
			});
		}

		view.getWelcomeLabel().addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				modifyView("" + TEXT_ID);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				modifyView("" + TEXT_ID);				
			}
		});
	}
	
	private void modifyView(String index) {
		try {
			view.update(Integer.valueOf(index));
		} catch (NumberFormatException e) {
			
		}
	}
	
	
	public static void main(String[] args) {
		new FocusController(new FocusView());
	}
}
