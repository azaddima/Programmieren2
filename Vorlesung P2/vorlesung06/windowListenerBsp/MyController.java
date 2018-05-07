package windowListenerBsp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyController {

	
	public MyController(MyFrame view) {
		view.dispose();
		
		view.getBtn().addActionListener(l -> {
			MyDialog dialog = new MyDialog();
			
			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosed(WindowEvent e) {
					System.out.println("windowClosed");
					
					//hier wollen wir unsere Daten abholen
					view.getBtn().setText(dialog.getNameTextField().getText());
					
				}

			});
		});
		
	}
			//der WindowListener ist wichtig, um sich später die Daten aus dem 
			//Dialogfenster abzuholen
//			dialog.addWindowListener(new WindowListener() {
//				
//				@Override
//				public void windowOpened(WindowEvent e) {
//					System.out.println("windowOpened");
//					
//				}
//				
//				@Override
//				public void windowIconified(WindowEvent e) {
//					System.out.println("windowIconified");
//					
//				}
//				
//				@Override
//				public void windowDeiconified(WindowEvent e) {
//					System.out.println("windowDeiconified");
//				}
//				
//				@Override
//				public void windowDeactivated(WindowEvent e) {
//					System.out.println("windowDeactivated");
//					
//				}
//				
//				@Override
//				public void windowClosing(WindowEvent e) {
//					System.out.println("windowClosing");
//					
//				}
//				
//				@Override
//				public void windowClosed(WindowEvent e) {
//					System.out.println("windowClosed");
//					
//					//hier wollen wir unsere Daten abholen
//					view.getBtn().setText(dialog.getNameTextField().getText());
//					
//				}
//				
//				@Override
//				public void windowActivated(WindowEvent e) {
//					System.out.println("windowActivated");
//					
//				}
//			});
//		});
		
	
	
	
	public static void main(String[] args) {
		new MyController(new MyFrame());
	}
}
