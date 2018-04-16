package focus;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class ManyComponentsController {
	
	public ManyComponentsController(FrameWithManyComponents view) {
		view.getOkBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
//				view.setVisible(false);
			}
		});
	
		view.getCancelBtn().addActionListener(l -> {
			view.getItalicRBtn().setSelected(false);
			view.getBoldRBtn().setSelected(false);
			view.getPlainRBtn().setSelected(true);
			view.getCheckBox().setSelected(false);
			view.getTextField().setText(FrameWithManyComponents.TEXT);
		});
		
		view.getTextField().addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if (view.getTextField().getText().equals("")){
					view.getTextField().setText(FrameWithManyComponents.TEXT);
				}				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if (view.getTextField().getText().equals(FrameWithManyComponents.TEXT)) {
					view.getTextField().setText("");
				}
				
			}
		});
		

		view.getBoldRBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getTextField().setFont(new Font(view.getFont().getFontName(), 
						Font.BOLD, 12));
				
			}
		});

		view.getItalicRBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Font font = view.getTextField().getFont();
				Font newFont = font.deriveFont(Font.ITALIC);
				view.getTextField().setFont(newFont);
				
			}
		});
		
		view.getPlainRBtn().addActionListener(l -> {
			Font font = view.getTextField().getFont();
			Font newFont = font.deriveFont(Font.PLAIN);
			view.getTextField().setFont(newFont);			
		});
//		view.getTextField().addMouseListener(new MouseListener() {
//			
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mousePressed(MouseEvent e) {
//				view.getTextField().setText("");
//				
//			}
//			
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		view.getTextField().getFont().deriveFont(Font.BOLD)
	}

}
